package test.load.java;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException	{
		
		//클래스가 로드가 되는 경우
		
		//new 객체 생성
		LoadTimeCheck loadTimeCheckClass = new LoadTimeCheck();
		
		//상수 클래스 멤버 호출시 
		//String name = LoadTimeCheck.NAME;
		
		//정적 클래스 멤버 변수
		//String a = LoadTimeCheck.a;
		
		
		//정적 메소드 호출
		//LoadTimeCheck.staticMethod();
		
		//일반 메소드 호출
		//loadTimeCheckClass.norMalMethod();
		
		//리플렉션
		//Class clazz = Class.forName("test.load.java.LoadTimeCheck");
		//Class clazz = LoadTimeCheck.class;
		
	}
	
}
