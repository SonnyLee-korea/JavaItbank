
public class ConOperatorQuiz {

	public static void main(String[] args) {
		/*
		 1. 1~100까지 랜덤 정수 발생시키세요.
		 
		 2. 랜덤값이 짝수라면 "짝수입니다" 홀수라면 "홀수입니다." 를
		 출력하는 3항 연삭식을 세워보세요.
		 
		 ex)
		 발생한 난수:xx
		 3항 연산의 결과:xx
		 */
		
		int rn = (int)((Math.random()*100)+1);
		String result = (rn%2==0? "짝수입니다.":"홀수입니다");
		System.out.println("발생한 난수:"+rn);
		System.out.println("3항 연산의 결과:"+result);
	}

}
