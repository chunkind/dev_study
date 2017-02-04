package sk_test01;

import java.io.FileWriter;
import java.util.Date;
/*
 *  FileWriter는 파일로 데이터를 출력하기 위한 출력 스트림 제공.
 *  
 *  시스템 프로퍼티란 시스템 환경에 관한 정보
 *  System 클래스에 있는 getProperty() 메서드를 이용하면 
 *  현재 사용하고 있는 환경 정보를 얻을 수 있다. 
 *  System 클래스를 이용하기 위해서는 java.util 패키지를 임포트한다. 
 *  
 *  주요 프로퍼티 
 *  ::
 *  line.separator : 행을 구분하는 문자(개행코드) : \n
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

