import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 # 사용자로부터 이름,나이를 입력받아서
		 
		 이름:ㅇㅇㅇ
		 나이:ㅇㅇ세
		 출생년도:ㅇㅇㅇㅇ년
		 을 출력하세요.
		 */
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.printf("이름:%s\n나이:%d세\n출생년도:%d년",name,age,(2020-age+1));
		sc.close();
	}

}
