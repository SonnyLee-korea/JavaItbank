
public class WhileExample2 {

	public static void main(String[] args) {
		
		//48~150사이의 정수 중 8의 배수를 가로로 출력해보세요
		
		int i =48;
		
		while(i<=150) {
			if(i%8==0) {
			System.out.print(i+",");
			}
			i++;
		}
		System.out.println(); //단순 줄 개행
		
		//1~100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력
		int k = 1;
		while(k<=100) {
			if(k%4==0 && k%8!=0) {
				System.out.print(k+" ");
			}
			k++;
		}
		
		System.out.println();
		
		//1~30000까지의 정수 중 258의 배수의 갯수를 구해보세요
		int n =1;
		int count = 0;
		
		while(n<=30000) {
			if(n%258==0) {
				count+=1;
			}
			n++;
		}
		System.out.println(count);
		
		
		

	}

}
