package sk_test01;

public class LogTest1 {
	
	public void xxx(){
		Log log = new Log(); // ��½�Ʈ���� ��´�. 
		log.debug("�α��׽�Ʈ!!"); // �α� �޼��� �����
		log.close(); // ��½�Ʈ�� �ݴ´�. 
	}
	
	public static void main(String[] args) {
		LogTest1 test = new LogTest1();
		test.xxx();
		System.out.println("line.separator :" + System.getProperty("line.separator"));
	}
}
