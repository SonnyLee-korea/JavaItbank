
public class LogicalOperator {

	public static void main(String[] args) {
		
		//비교(관계)연산자(<,<=,>,>=,==,!=
//		System.out.println(10>=10);
		
		/*
		 # 논리연산자 (&,&&,|,||)
		 - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		 1. &,&&:양쪽 항의 논리 값이 모두 true 일 때만 true 를 도출
		 2. |,||:양쪽 항의 논리 값 중 한쪽만 true 여도 true를 도출
		 */
		
		int x = 10,y=20;
		System.out.println(x>10 && y<30);
		System.out.println(x>10 || y<30);
		
		System.out.println("===================");
		int z = 10;
		System.out.println(z==10);
		
		
		
		
	}

}
