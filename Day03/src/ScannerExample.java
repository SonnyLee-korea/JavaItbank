//1. Scanner api 로딩.
import java.util.Scanner;


public class ScannerExample {

	public static void main(String[] args) {
		
		//2. Scanner의 객체 생성.
		Scanner sc =new Scanner(System.in);
		
		/*
		 3. Scanner의 함수들으 이용하여 데이터를 입려받을 수 있습니다.
		 - next(): 공백이 없는 문자열을 입력받습니다.
		 - nextline(): 공백을 포함한 문자열을 입력받습니다.
		 - next + 기본타입이름(): 해당타입에 맞는 데이터를 입력받습니다.
		 ex)
		 	nextInt() : 정수 데이터를 입력받습니다.
		 	nextDouble() : 실수 데이터를 입력받습니다.
		 */
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		System.out.println("제 이름은"+name+"이고, 나이는"+age+"세 입니다");
		
		//4. Scanner 객체는 반납
		sc.close();
		
		
	}

}
