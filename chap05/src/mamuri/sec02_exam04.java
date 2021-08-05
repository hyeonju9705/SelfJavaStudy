package mamuri;

public class sec02_exam04 {

	public static void main(String[] args) {
		// for문 이용 - 배열 항목에서 최대값 구하기
		int max=0;
		int[] array= {1,5,3,8,2};
		
		//작성위치
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max= array[i];
			}
		}
		
		System.out.println("max: "+max);
	}

}
