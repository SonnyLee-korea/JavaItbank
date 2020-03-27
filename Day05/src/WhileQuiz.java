
public class WhileQuiz {

	public static void main(String[] args) {
		// 1~1000 까지의 정수 중 3의 배수의 합을 구해보세요
		int i = 1;
		int total = 0;
		while(i<=1000) {
			if(i%3==0) {
				total+=i;
			}
			i++;
		}
		
		System.out.println(total);
		
		int k = 1;
		int total1 = 0;
		while(k<=1000) {
			total1=(k%3==0? total1+=k:total1);
			k++;
			
		}
		
		System.out.println(total1);
		
		
		
		
		
		
		
		
		
		
		

	}

}
