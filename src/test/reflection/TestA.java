package test.reflection;

public class TestA {

	int a = 1;
	String b = "하이"; 
	
	static {
		System.out.println("정적 블럭 실행!");
	}
	
	TestA (){
		System.out.println("생성자 호출");	
	}
}
