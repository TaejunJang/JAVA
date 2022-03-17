package test.reflection;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		try {
			//이자체로 클래스 로드 시킴
			Class clazz = Class.forName("test.reflection.TestA");
				
			//생성자 호출
			clazz.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
