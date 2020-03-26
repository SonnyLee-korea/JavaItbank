

public class ConditionalOperator {

	public static void main(String[] args) {
		
		/*
		 # 3항 연산자
		 - 피연산자 (연산을 당하는 값) 가 3개인 연산자를 말합니다.
		 - (조건식?좌항:우항)
		 - 조건식을 비교하여 true가 도출되었을 시에 좌항을,
		 	false가 도출되었을 시에 우항의 식이 실행됩니다.
		 */
		
		boolean result=(5==4? true:false);
		System.out.println(result);

		//난수(랜덤값)를 발생시키는 메서드 Math.random()
		//0.0이상 1.0미만의 랜덤 실수값을 반환합니다.
		
//		double rn= Math.random();
//		System.out.println(rn);
		
		//1~10까지의 정수 난수를 발생시키고 싶어요
		int rn = (int)((Math.random()*10)+1);
		System.out.println(rn);
		
		//10~100까지 정수난수
		int rn2 = (int)((Math.random()*91)+10);
		
	}

}
