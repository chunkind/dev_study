<?php
//################################################################################
// header setting
//################################################################################
function header_print(){
	$row=sql_fetch("select * from tbl_header order by f_wdate limit 0,1");

	echo '<title>'.$row['f_title'].'</title>'.PHP_EOL;
	echo '<meta name="description" content="'.$row['f_description'].'" />'.PHP_EOL;
	echo '<meta property="og:type" content="'.$row['f_ogtype'].'" />'.PHP_EOL;
	echo '<meta property="og:title" content="'.$row['f_ogtitle'].'" />'.PHP_EOL;
	echo '<meta property="og:description" content="'.$row['f_ogdescription'].'" />'.PHP_EOL;
	echo '<meta property="og:image" content="http://'.$_SERVER['HTTP_HOST'].'/data/banner/'.$row['f_upfile_name'].'" />'.PHP_EOL;
	echo '<meta property="og:url" content="'.$row['f_ogurl'].'" />'.PHP_EOL;
	echo '<meta name="naver-site-verification" content="'.$row['f_naverkey'].'">'.PHP_EOL;
}
?>