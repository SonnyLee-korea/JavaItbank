import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오:");
		int height = sc.nextInt();
		
		System.out.print("나이를입력하시오:");
		int age = sc.nextInt();
		
		if(height>=140 & age>=8) {
			System.out.println("탑승이 가능합니다");
		}
		else {
			System.out.println("탑승이 불가능합니다");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요~");
		sc.close();

	}

}
