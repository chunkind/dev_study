<?
session_start();
session_unset();
session_destroy();

$adm_root = "/adm_w";

if($main=="ok"){
	echo"
	<script language='javascript'>
		location.href='/';
	</script>
	";
}else{
	echo"
	<script language='javascript'>
		document.location.href='".$adm_root."/login_w.php';
	</script>
	";
}
?>