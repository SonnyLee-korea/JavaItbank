import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		
		/*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를 가로로 출력하고
		 그 소수들의 합을 구하는 로직을 작성
		 입력:12
		 소수: 2 3 5 7 11
		 소수들의 총합
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		int num = sc.nextInt();
		int sum_ = 0;
		int count;
		
		for(int i=2; i<=num;i++) {
			count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count+=1;		
				}		
			}
			if(count==2) {
				System.out.printf("%d ",i);
				sum_+=i;
//				System.out.print(i+',');
		}
	}
		System.out.println("\n");
		System.out.println(sum_);
		sc.close();
		}
	}

