
public class VariableExample {

	public static void main(String[] args) {
		
		/*
		 * 변수(variable) 
		 1. 변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
		 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라
		        적당한 데이터 타입을 설정합니다.
		 	ex) int: 4바이트 정수, String: 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		        그리고, 하나의 변수에는 하나의 데이터만 저장할 수 있습니다.
		 4. 변수 내부의 값은 언제든지 변경이 가능합니다.  
		 */

		// 변수의 선언: [자료형(데이터 타입)] [변수명];
		int age;
		
		// 변수의 초기화 : 초기값을 넣어주는 행위[변수명]=[값];
		age=20;
		
		//변수의 값을 참조
		System.out.println("age:"+age);
		
		// 변수는 선언과 동시에 초기화할 수 있습니다. (처음 선언 시 1번만 가능)
//		int score;
//		score = 95;
		
		int score =95;
		score = 95; //변수의 값 변경시에는 자료형(데이터타입)을 쓰지 않습니다.
		System.out.println(score);
		
		//변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count="한번";
//		int count=23.5; 
		String name="100";
		
		int doubleScore=score*2;
		System.out.println(doubleScore);
//		int name=572;
//		int result
		
	}

}
