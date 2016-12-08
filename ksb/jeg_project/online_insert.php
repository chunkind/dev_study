<?
$board = 'tbl_online';

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