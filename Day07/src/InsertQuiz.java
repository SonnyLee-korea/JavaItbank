import java.util.Scanner;

public class InsertQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 사용자에게 먹고 싶은 음식을 입력받아서
		 선언한 배열에 넣기
		 배열은 String[]로 100개 짜리 배열을 선언해 주세요.
		 
		 2. "배불러" 라는 문자열을입력받았을 때에는
		 반복문 종료
		 
		 3. 반복문 종료 후 "내가 먹고 싶은 음식들:~~~" 형식으로
		 입력받은 값을   null제외 출력
		 */

		
		Scanner sc = new Scanner(System.in);
		String[] food = new String[100];
		
		for(int i =0 ; i<food.length; i++) {
			System.out.print("먹고 싶은 음식을 입력해주세요:");
			String menu = sc.next();
			if(menu.equals("배불러")) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			food[i]=menu;
		}
		System.out.print("내가 먹고 싶은 음식들:");
		for(String str:food) {
			if(str==null) {
				break;
			}
			
			System.out.print(str+" ");
		}
		sc.close();
		
		
		
		
	}

}
