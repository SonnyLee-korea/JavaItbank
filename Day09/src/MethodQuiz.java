
public class MethodQuiz {
	
	static void sum(int num) {
		int total = 0;
		System.out.printf("%d의 약수: ",num);
		for(int i =1 ; i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				total+=i;
			}
		}
		System.out.println();
		System.out.printf("%d의 약수의 총합: %d",num,total);
	}
	
	
	
	

	public static void main(String[] args) {
		/*
		 1. 정수를 하나 받아서 해당하는 수의 약수의 총합을 구해서 
		 그 총합을 리턴하는 메서드를 하나 선언하세요.
		 2. 이 메서드매개 값으로 받은 정수의 모든 약수를 가로로 출력한 후
		 그 약수들으 총합을 리턴해 주는 메서드입니다.
		 3. 메서드 선언을 완료한 후에 메서드를 호출하여 
		 10의 약수의 총합, 72의 약수의 총합을 구해보세요
		 4. 메서드 이름은 sum으로 통일
		 */
		
		sum(10);
		System.out.println();
		sum(72);
	}

}
