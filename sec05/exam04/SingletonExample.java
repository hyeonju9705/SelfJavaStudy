package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// �̱��� ��ü
		Singleton obj1= Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("���� SIngleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}

}
