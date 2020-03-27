import java.util.Scanner;

public class WhileQuiz2 {

	public static void main(String[] args) {
		/*
		 1. 정수를 2개 입력받으세요(x,y)
		 2. x부터 y까지의 누적합계를 while를 사용하여 구하는 코드를 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		System.out.print("x를 입력하세요:");
		int x = sc.nextInt();
		System.out.print("y를 입력하세요:");
		int y = sc.nextInt();
		int i;
		int min;
		if(x>=y) {
			i = x-y;
			min=y;
		}
		else {
			i = y-x;
			min=x;
		}
		
		
		while(i>=0) {
			total+=min+i;
			i-=1;
		}
		
		System.out.println(total);
		
		
		
		System.out.println("==============");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
