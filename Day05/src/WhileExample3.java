import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수인지 (prime number)인지를 판별
		 */
		
		System.out.print("숫자를 입력하세요:");
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int k = 2;
		int count=0;
		while(k<=i) {
			if(i%k==0) {
				count+=1;
		}k++;
	}
		
		if(count==1) {
			System.out.println(i+"는 소수입니다");
		}
		else {
			System.out.println(i+"는 소수가 아닙니다");
		}
		
		
		
		System.out.println("=========================");
		
		int j = 2;
		while(i%j!=0) {
			j++;
		}
		
		
		System.out.println((i==j? "소수입니다":"소수가아닙니다"));
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
