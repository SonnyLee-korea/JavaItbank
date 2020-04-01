
/*
 # 메서드(method)
 
 - 메서드는 반복되는 코드 블록에 이름을 붙여 놓은 것입니다.
 
 - 메서드는 반복되는 코드를 줄여주고, 좀 더 구조화시켜서 우리가 코드를 알아보기 쉽게 합니다.(코드의 모듈화)
 
 - 메서드는 선언하는 과정과 호출하는 과정으로 나누어 집니다.
 
 - 메서드 선언은 메서드내부에서는 불가능합니다. 새로운 메서드의 선언은
 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.
 
 - 메서드 호출은 메서드나 생성자 블록 내부에서만 가능합니다.
 
 */



public class MethodExample1 {
	
	// 메서드의 선언.
	
	static int calcTotal(int x) {
		int total=0;
		for(int i=1;i<=x;i++) {
			total+=i;
		}
		return total;
	}
								
	public static void main(String[] args) {
//		System.out.println(calcTotal(10));
//		
		int result = calcTotal(10);
		System.out.println(result);
		System.out.println("1~100까지의 누적합: "+calcTotal(100));
	}

}
