package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {
		// ���ڿ� ��ġ�ϱ�
		String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
