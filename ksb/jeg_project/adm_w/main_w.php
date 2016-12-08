<?
	//챠트 로직
	$searchEndText = date("Y-m-d");
	$year = date("Y");
	$month = date("m");
	$day = date("d");

	$timestamp = mktime(0,0,0, $month, $day, $year);
	$last_week = strtotime("-1 week",$timestamp);
	$searchStartText = date("Y-m-d",$last_week);

	$chartquery = "SELECT SUM(JOIN_COUNT) AS JOIN_COUNT, JOIN_DATE FROM tbl_log_ip
						  WHERE JOIN_DATE BETWEEN '".str_replace("-","",trim($searchStartText))."' AND '".str_replace("-","",trim($searchEndText))."'
						  GROUP BY JOIN_DATE";

	$categorytitle = "검색 : ".$searchStartText." ~ ".$searchEndText;
	$graphvalue = "일";

	$chartColorArray = array("#FF0F00" , "#FF6600", "#FF9E01", "#FCD202", "#F8FF01", "#B0DE09", "#04D215", "#0D8ECF", "#0D52D1", "#2A0CD0", "#8A0CCF", "#CD0D74", "#754DEB", "#DDDDDD", "#999999", "#333333", "#000000", "#FF0F00" , "#FF6600", "#FF9E01", "#FCD202", "#F8FF01", "#B0DE09", "#04D215", "#0D8ECF", "#0D52D1", "#2A0CD0", "#8A0CCF", "#CD0D74", "#754DEB", "#DDDDDD");

	$chartquery_result = sql_query($chartquery);
	$chartquery_count = mysql_num_rows(mysql_query($chartquery));
	$chartHeight = "290px";

	//총방문자
	$totalCount = sql_fetch("SELECT COUNT(*) AS num FROM tbl_log_ip");
?>
<style>
#chartdiv {background: #ffffff;color:#ffffff;
	width		: 100%;
	height	: <?=$chartHeight?>;
	font-size	: 11px;
}
</style>
<script type="text/javascript" src="<?=$adm_root?>/board/statistics/amcharts/amcharts.js"></script>
<script type="text/javascript" src="<?=$adm_root?>/board/statistics/amcharts/serial.js"></script>
<script type="text/javascript" src="<?=$adm_root?>/board/statistics/amcharts/pie.js" ></script>
<script type="text/javascript" src="<?=$adm_root?>/board/statistics/amcharts/themes/light.js"></script>
<script type="text/javascript">
	var chart;

	var chartData = [
		<?
			if ($chartquery_count > 0) {
				for($c=0; $chartquery_row=sql_fetch_array($chartquery_result); $c++){

					$dateText = substr($chartquery_row[JOIN_DATE], 6,2);

					if ($c > 0) { echo ","; }

				echo "{";
				echo  "\"joindate\":\"".$dateText."\",";
				echo  "\"visits\":\"".$chartquery_row[JOIN_COUNT]."\",";
				echo  "\"color\":\"".$chartColorArray[$c]."\"";
				echo "}";
				}
			}
			else {
				echo  "{ }";
			}
		?>

	];

<? if ($chartquery_count > 0) { ?>
		    AmCharts.ready(function () {

		    // SERIAL CHART
		    chart = new AmCharts.AmSerialChart();
		    chart.dataProvider = chartData;
		    chart.startDuration = 1;
		    chart.categoryField = "joindate";

		    // listen for "dataUpdated" event (fired when chart is inited) and call zoomChart method when it happens
		    chart.addListener("dataUpdated", zoomChart);

		    // AXES
		    // category
		    var categoryAxis = chart.categoryAxis;
		    categoryAxis.minorGridEnabled = false;
			categoryAxis.title = "Date <?=$categorytitle?>";
			categoryAxis.titleColor = "#2d2a2a";
			categoryAxis.gridPosition = "start";
			categoryAxis.gridColor = "#81819d";
			categoryAxis.axisColor = "#797984";
			categoryAxis.color =  "#2d2a2a";
		    categoryAxis.twoLineMode = false;

		    // first value axis (on the left)
		    var valueAxis = new AmCharts.ValueAxis();
			valueAxis.title = "Visitors";
			valueAxis.titleColor = "#2d2a2a";
		    valueAxis.axisColor = "#2f7ed8";
		    valueAxis.axisThickness = 1;
		    valueAxis.gridAlpha = 0;
		    valueAxis.position = "left";
			valueAxis.gridColor = "#81819d";
			valueAxis.axisColor = "#797984";
			valueAxis.color =  "#2d2a2a";
		    chart.addValueAxis(valueAxis);

		    // GRAPHS
		    // first graph
		    var graph = new AmCharts.AmGraph();
		    graph.valueAxis = valueAxis; // we have to indicate which value axis should be used
		    graph.valueField = "visits";
		    graph.bullet = "round";
		    graph.balloonText =  "<span style='font-size:14px'>[[category]]<?=$graphvalue?>: <b>[[value]]</b></span>";
			graph.hideBulletsCount = 30;
			graph.bulletBorderThickness = 1;
		    chart.addGraph(graph);

		    // CURSOR
		    var chartCursor = new AmCharts.ChartCursor();
		    chartCursor.cursorAlpha = 0.1;
		    chartCursor.fullWidth = true;
		    chart.addChartCursor(chartCursor);

		    // SCROLLBAR
		    var chartScrollbar = new AmCharts.ChartScrollbar();
		    chart.addChartScrollbar(chartScrollbar);

		    // LEGEND
		    //var legend = new AmCharts.AmLegend();
		    //legend.marginLeft = 110;
		    //legend.useGraphSettings = true;
		    //legend.valueText = "";
		    //legend.align = "center";
		    //chart.addLegend(legend);

		    // WRITE
		    chart.write("chartdiv");
		});
<? } ?>
		// this method is called when chart is first inited as we listen for "dataUpdated" event
	function zoomChart() {
		// different zoom methods can be used - zoomToIndexes, zoomToDates, zoomToCategoryValues
		chart.zoomToIndexes(0, 96);
	}
</script>
<div class="index_wrap"><!-- index_wrap start -->

	<div class="mc_left"><!-- mc_left start -->

	<div class="graph" id="chartdiv" style="clear:both; width: 100%; height: <?=$chartHeight?>;"><!-- graph start -->
	</div><!-- graph end -->
	<p class="bt_detail"><a href="<?=$adm_root?>/index.php?left=99"><img src="<?=$adm_root?>/image/btn_index_detail.gif" alt="자세히보기" /></a></p>
	</div><!-- mc_left end -->

	<div class="mc_right"><!-- mc_right start -->
	<table summary="서비스 이용현황"><!-- table start -->
	<caption>서비스 이용현황</caption>
	<colgroup>
		<col style="width:40%;" />
		<col style="width:60%;" />
	</colgroup>
	<thead>
	<tr>
		<th colspan="2">서비스 이용현황</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<th scope="row">총방문자</th>
		<td><?=number_format($totalCount[num])?></td>
	</tr>
	<?
	$now=date("Y-m-d");
	$mnum=sql_fetch("select count(*) as num from tbl_member where substring(f_wdate,1,10)='$now'");
	?>
	<tr>
		<th scope="row">금일가입자</th>
		<td><?=number_format($mnum[num])?></td>
	</tr>
	<?
	$bnum=sql_fetch("select count(*) as num from tbl_board where substring(f_wdate,1,10)='$now'");
	?>
	<tr>
		<th scope="row">신규등록글수</th>
		<td><?=number_format($bnum[num])?></td>
	</tr>
	</tbody>
	</table><!-- table end -->
	</div><!-- mc_right end -->

	<div class="mc_bottom"><!-- mc_bottom start -->
		<dl>
			<dt>신규게시글</dt>
			<dd>
				<ul>
					<?
					$result=sql_query("select A.f_subject,A.f_comment,A.f_id,A.f_familly,A.f_wdate,A.f_bid,B.f_board_name,B.f_link from tbl_board as A,tbl_set_board as B where A.f_bid=B.f_bid and substring(A.f_wdate,1,10)='$now' order by A.f_wdate desc limit 0,5");
					while($row=sql_fetch_array($result)){
						if($row[f_familly]==0){
							$chk="";
							$subject=$row[f_subject];
							$id=$row[f_id];
						}else{
							$chk="[댓글]";
							$subject=$row[f_comment];
							$id=$row[f_familly];
						}
					?>
					<li><p><a href="<?=$row[f_link]?>?mode=read&id=<?=$id?>">[<?=$row[f_board_name]?>]<?=$chk?><?=cut_string($subject,150)?></a></p><p class="day"><?=substr($row[f_wdate],5,2)?>.<?=substr($row[f_wdate],8,2)?></p></li>
					<?}?>
				</ul>
			</dd>
		</dl>
	</div><!-- mc_bottom end -->

</div><!-- index_wrap end -->