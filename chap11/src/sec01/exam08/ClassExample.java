package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws Exception{
		// Class ��ü ���� ���
		//ù ��° ���
		Class clazz = Car.class;
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
	}

}
