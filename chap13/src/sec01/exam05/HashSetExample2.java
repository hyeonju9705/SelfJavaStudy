package sec01.exam05;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		// Member °´Ã¼¸¦ Áßº¹ ¾øÀÌ ÀúÀåÇÏ´Â HashSet
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿",30));
		set.add(new Member("È«±æµ¿", 30));
		
		System.out.println("ÃÑ °´Ã¼¼ö : "+set.size());
	}

}
