package sk_test01;

import java.io.FileWriter;
import java.util.Date;
/*
 *  FileWriter�� ���Ϸ� �����͸� ����ϱ� ���� ��� ��Ʈ�� ����.
 *  
 *  �ý��� ������Ƽ�� �ý��� ȯ�濡 ���� ����
 *  System Ŭ������ �ִ� getProperty() �޼��带 �̿��ϸ� 
 *  ���� ����ϰ� �ִ� ȯ�� ������ ���� �� �ִ�. 
 *  System Ŭ������ �̿��ϱ� ���ؼ��� java.util ��Ű���� ����Ʈ�Ѵ�. 
 *  
 *  �ֿ� ������Ƽ 
 *  ::
 *  line.separator : ���� �����ϴ� ����(�����ڵ�) : \n
 */
public class Log {
	String logFile = "C:/debug.log";
	FileWriter fw;
	static final String ENTER = System.getProperty("line.separtor");
	
	public Log(){
		try {
			fw = new FileWriter(logFile,true);
		} catch (Exception e) {}
	}	
		
	public void close() {
		try {
			fw.close();	
		} catch (Exception e) {}
	}
	
	public void debug(String msg){
		try {
			fw.write(new Date()+" : ");
			fw.write(msg + ENTER);
			fw.flush();
		} catch (Exception e) {
			System.err.print("IOException");
		}
	}
 }

