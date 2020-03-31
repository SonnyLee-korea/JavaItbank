import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i =1 ; i<=10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("\n반복문 종료");

		for(int i =1;i<=30;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		
		while(true) {
			System.out.println(">");
			int answer = sc.nextInt();
			if(answer==1) {
				break;
			}
			else if(answer==0) {
				System.out.println("0은 입력하면 안됩니다");
				continue;
			}
			System.out.println("100/입력한 정수의 값:"+(100/answer));
			
		}
		
		
		
		
		
	}

}
