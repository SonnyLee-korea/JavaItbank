import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		//1~10까지의 누적합을 구하는 로직
		
		int total=0;
		int n=1;
		
//		do {
//			total+=n;
//			n++;
//		}while(n<=10);
//		
//		System.out.println(total);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		System.out.println("종료하시려면 0을 입력하세요");
		int num;
		do {
			System.out.println(">>");
			num = sc.nextInt();
			System.out.println("입력하신 정수:"+num);
		}while(num !=0);
	}

}
