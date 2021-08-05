package mamuri;

public class sec02_exam05 {

	public static void main(String[] args) {
		// 중첩for문 이용 - 배열 전체항목 합과 평균값 구하기
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg = 0.0;
		
		//작성위치
		int count=0;
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum=sum+array[i][k];
				count++;
			}
		}
		
		avg=(double)sum/count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);

	}

}
