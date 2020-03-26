import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요:");
		int number = sc.nextInt();
		
		if(number==0) {
			System.out.println("0입니다");
		}else if(number%7==0) {
			System.out.println("7의 배수입니다.");
		}else {
			System.out.println("7의 배수가 아닙니다");
		}
		sc.close();

	}

}
