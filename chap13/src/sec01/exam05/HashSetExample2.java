package sec01.exam05;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		// Member ��ü�� �ߺ� ���� �����ϴ� HashSet
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü�� : "+set.size());
	}

}
