package sk_test01;

public class LogTest1 {
	
	public void xxx(){
		Log log = new Log(); // 출력스트림을 얻는다. 
		log.debug("로그테스트!!"); // 로그 메세지 남기기
		log.close(); // 출력스트림 닫는다. 
	}
	
	public static void main(String[] args) {
		LogTest1 test = new LogTest1();
		test.xxx();
		System.out.println("line.separator :" + System.getProperty("line.separator"));
	}
}
