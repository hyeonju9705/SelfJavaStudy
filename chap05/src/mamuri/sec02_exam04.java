package mamuri;

public class sec02_exam04 {

	public static void main(String[] args) {
		// for�� �̿� - �迭 �׸񿡼� �ִ밪 ���ϱ�
		int max=0;
		int[] array= {1,5,3,8,2};
		
		//�ۼ���ġ
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max= array[i];
			}
		}
		
		System.out.println("max: "+max);
	}

}
