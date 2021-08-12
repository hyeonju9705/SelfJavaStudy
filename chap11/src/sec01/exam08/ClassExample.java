package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		// Class 객체 정보 얻기
		//첫 번째 방법
		Class clazz = Car.class;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
