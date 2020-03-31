import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {
		
		String[] food = {"삼겹살","족발","피자","햄버거"};
		
		System.out.println(Arrays.toString(food));
		
		food[2]="짜장면";
		food[0]="탕수육";
		System.out.println(Arrays.toString(food));
		
		// 배열의 인덱스 번호 탐색.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("탐색할 음식을 입력하세요:");
		
		
			while(true) {
				String name = sc.next();
				for(int i =0;i<food.length;i++) {
					if(name.equals(food[i])) {
						System.out.println("찾았습니다:"+i);
						break;
					}
				
			}
		}
			
			
			
			

	}

}
