package test.load.java;

public class LoadTimeCheck {
	
	static String a = "a";
	static final String NAME ="태준";
	int b;
	
	//정적 블럭
	static {
		System.out.println("정적 블럭");
	}
	
	//인스턴스 블럭
	{
		System.out.println("인스턴스 블럭");
	}
	
	LoadTimeCheck()	{
		System.out.println("생성자 호출");
	}
	
	
	public static void staticMethod() {
		System.out.println("정적 메소드 호출");
	}
	
	public void  norMalMethod() {
		System.out.println("일반 메소드 호출");
	}
	
}
