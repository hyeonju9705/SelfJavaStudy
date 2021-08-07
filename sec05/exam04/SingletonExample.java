package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// ΩÃ±€≈Ê ∞¥√º
		Singleton obj1= Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("∞∞¿∫ SIngleton ∞¥√º¿‘¥œ¥Ÿ.");
		} else {
			System.out.println("¥Ÿ∏• Singleton ∞¥√º¿‘¥œ¥Ÿ.");
		}
	}

}
