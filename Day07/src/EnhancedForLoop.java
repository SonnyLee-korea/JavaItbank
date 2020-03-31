
public class EnhancedForLoop {

	public static void main(String[] args) {
		String[] week = {"월","화","수","목","금","토","일"};
		
//		for(int i =0;i<week.length;i++) {
//			System.out.println(week[i]+"요일");
//		}
		
		for(String day :week) {
			System.out.println(day+"요일");
		}
		
		/*
		 1. scores라는 이름으로 int배열을 하나 선언해서 점수 데이터를 저장하세요.
		 2. 향상for문(forEach)을 사용하여 총점과 평균을 구해보세요/
		 총점(int), 평균(double,소수점 둘째 자리까지 표현)
		 */
		
		int[] scores = {96,88,74,63,100,55};
		int sum_ = 0;
		for(int i:scores) {
			sum_+=i;
		}
		System.out.println("총점:"+sum_);
		System.out.printf("평균:%.2f\n",((double)sum_/scores.length));
		

	}

}
