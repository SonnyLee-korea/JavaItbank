import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int point = sc.nextInt();
		
		/*
		 - switch 키워드 뒤에 나오는 괄호 안에는 boolean형 조건식이 아닌
		 변수나, 변수의 연산식을 적어야하며, 타입은 정수나 문자열만 가능합니다.
		 */
		
		switch(point/10) {
		case 10:
		
			if(point>100) {
				System.out.println("점수를 잘 못 입력하셨습니다.");
				break;
			}
			
			
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break; //탈출문
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break; //탈출문
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break; //탈출문
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break; //탈출문
		default : //case를 잡지 않은 모든 경우의 수가 dafault로 이동.
			if(point>100 || point<0) {
				System.out.println("점수를 잘 못 입력하셨습니다");
			}else {
			System.out.println("당신의 학점은 F입니다.");
		
		}

	}

}}
	
