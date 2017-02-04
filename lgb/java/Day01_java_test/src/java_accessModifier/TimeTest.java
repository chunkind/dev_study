package java_accessModifier;
/*
 * >> 접근 제어자를 이용한 캡슐화 
 * 클래스나 멤버,주로 멤버에 접근 제어자를 사용하는 이유는 클래스의 내부에 선언된 
 * 데이터를 보호하기 위해서이다. 
 * 데이터가 유효한 값을 유지하도록 또는 비밀번호와 같은 데이터를 외부에서 함부로 변경하지 못하도록 
 * 접근을 제한하는 것
 * 
 */
class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(int hour,int minute,int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
		
	}
	
	public int getHour(){
		return hour;
	}
	public void setHour(int hour){
		if(hour<0 || hour>23) return;
		this.hour = hour;
	}
	
	public int getMinute(){
		return minute;
	}
	public void setMinute(int minute){
		if(minute<0 || minute>59) return;
		this.minute = minute;
	}
	
	public int getSecond(){
		return minute;
	}
	public void setSecond(int second){
		if(second<0 || second>59) return;
		this.second = second;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
}

public class TimeTest{
	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		// t.hour = 13; 변수 hour의 접근 제어자가 private라 접근 불가 
		t.setHour(t.getHour()+1);
		System.out.println(t);
	}	
}
