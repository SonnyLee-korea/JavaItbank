import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {

		
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 , 정답을 입력받으세요
		 만약 0을 입력하면 반복문을 탈출시키세요
		 
		 2. 종료 이후에 정답 횟수와 오답횟수를 각각 출력하세요.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int correct_co=0;
		int wrong_co=0;
		
		while(true) {
			int first = (int)((Math.random()*100)+1);
			int second = (int)((Math.random()*100)+1);
			int type_= (int)(Math.random()*2);
			
			
			if(type_==0) {
			System.out.println(first+"+"+second+"=????");
			System.out.print("답을 입력해주세요:");
			int answer = sc.nextInt();
			
			if(answer==0) {
				break;
			}
			else if(answer==first+second) {
				System.out.println("정답입니다!");
				correct_co++;
			}
			else{
				System.out.println("틀렸습니다~~");
				wrong_co++;
			}
			
			
			}else {
			System.out.println(first+"-"+second+"=????");
			System.out.print("답을 입력해주세요:");
			int answer = sc.nextInt();
			
			if(answer==0) {
				break;
			}
			else if(answer==first-second) {
				System.out.println("정답입니다!");
				correct_co++;
			}
			else{
				System.out.println("틀렸습니다~~");
				wrong_co++;
			}}
			
			
			
			}
	
		System.out.println("-------------------");
		System.out.println("정답 횟수:"+correct_co);
		System.out.println("오답 횟수:"+wrong_co);
		sc.close();
		
		
		
		
		
		
		
		
		

	}

}
