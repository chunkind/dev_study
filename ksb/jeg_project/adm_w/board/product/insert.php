<?
for($m = 1; $m <= 6 ;$m++){
	if ($img = $_FILES['upfile'.$m][name]) {
		if (!preg_match("/\.(gif|jpg|png)$/i", $img)) {
			alert_msg("첨부 이미지가 gif, jpg, png 파일이 아닙니다.");
		}
	}
}

$data_dir = $DOCUMENT_ROOT."/data/product"; //제품사진 저장경로

//에디터 이미지 처리 관련 정보
$board_tmp_web = "/ksboard/tmp"; //에디터 이미지 저장된 웹경로
$board_tmp = $DOCUMENT_ROOT.$board_tmp_web; //에디터 이미지 저장된 서버경로
$board_http_upload_dir = "/data/product/editor"; //에디터 이미지 저장될 웹주소
$board_upload_dir = $DOCUMENT_ROOT.$board_http_upload_dir;  //에디터 이미지 저장될 서버주소
if (!$sort) $sort = 1;

if (!trim($ca_id))
	alert_msg("카테고리 오류","","");

// 소문자로 변환
$ca_id = strtolower($ca_id);

for($i=1;$i<=6;$i++){
	if(${'upfile'.$i.'_size'} > 0){
		$path_parts = pathinfo(${'upfile'.$i.'_name'});
		${'upfile_name'.$i} = uniqid("").".".$path_parts["extension"];
		copy(${'upfile'.$i},$data_dir."/".${'upfile_name'.$i});

		if($i==1){
			thumbnail($upfile_name1, $data_dir, $data_dir."/thumb","thumb", "170", "150");
		}

	}
}

/* 웹에디터 이미지 첨부 시작*/
$comment2=str_replace("\\","",$comment); // \없애기
if(preg_match_all("/ src=\"(.*?)\"/i",$comment2,$found)) {
	$tmp_dir = $board_tmp;
	for ($i=0; $i< count($found[1]); $i++) {
		$b = split('/tmp/',$found[1][$i]);
		$c = split('>',$b[1]);
		$tmp_file=$tmp_dir."/".$c[0];
		if(file_exists($tmp_file)==1 and $c[0]!=""){
			copy($tmp_file,$board_upload_dir."/".$c[0]);
			unlink($tmp_file);
		}
	}
}
$comment=str_replace($board_tmp_web,$board_http_upload_dir,$comment); // \이미지 경로 바꾸기
/* 웹에디터 이미지 첨부 끝*/

/* 웹에디터 이미지 첨부 시작*/
$note12=str_replace("\\","",$note1); // \없애기
if(preg_match_all("/ src=\"(.*?)\"/i",$note12,$found)) {
	$tmp_dir = $board_tmp;
	for ($i=0; $i< count($found[1]); $i++) {
		$b = split('/tmp/',$found[1][$i]);
		$c = split('>',$b[1]);
		$tmp_file=$tmp_dir."/".$c[0];
		if(file_exists($tmp_file)==1 and $c[0]!=""){
			copy($tmp_file,$board_upload_dir."/".$c[0]);
			unlink($tmp_file);
		}
	}
}
$note1=str_replace($board_tmp_web,$board_http_upload_dir,$note1); // \이미지 경로 바꾸기
/* 웹에디터 이미지 첨부 끝*/

/* 웹에디터 이미지 첨부 시작*/
$note22=str_replace("\\","",$note2); // \없애기
if(preg_match_all("/ src=\"(.*?)\"/i",$note22,$found)) {
	$tmp_dir = $board_tmp;
	for ($i=0; $i< count($found[1]); $i++) {
		$b = split('/tmp/',$found[1][$i]);
		$c = split('>',$b[1]);
		$tmp_file=$tmp_dir."/".$c[0];
		if(file_exists($tmp_file)==1 and $c[0]!=""){
			copy($tmp_file,$board_upload_dir."/".$c[0]);
			unlink($tmp_file);
		}
	}
}
$note2=str_replace($board_tmp_web,$board_http_upload_dir,$note2); // \이미지 경로 바꾸기
/* 웹에디터 이미지 첨부 끝*/

$sql=" insert $board set
										f_ca_id='$ca_id',
										f_sort='$sort',
										f_subject='$subject',
										f_upfile_name1='$upfile_name1',
										f_upfile_name2='$upfile_name2',
										f_upfile_name3='$upfile_name3',
										f_upfile_name4='$upfile_name4',
										f_upfile_name5='$upfile_name5',
										f_upfile_name6='$upfile_name6',
										f_comment='$comment',
										f_note1='$note1',
										f_note2='$note2',
										f_wdate=now()";
$r=sql_query($sql);

if($r){
	alert_msg("등록되었습니다","$PHP_SELF?left=$left&keyword=$keyword&option=$option&ca_id=$ca_value","");
}else{
	alert_msg("등록실패!","","");
}
?>