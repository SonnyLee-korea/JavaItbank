public class ForQuiz {

	public static void main(String[] args) {
		
		/*
		 사용자에게 구구단 단수를 입력받은 후,
		 해당 단수의 구구단을 출력해 보세요
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("구구단 단수를 입력해주세요:");
//		int num= sc.nextInt();
		//2~19까지의 랜덤 구구단 출력
		int num= (int)((Math.random()*18)+2);
		System.out.printf("*** 구구단 %d단 ***\n-------------------\n",num);
		
		for(int i =1 ; i<=9 ; i++) {
			System.out.printf("%d x %d = %d\n",num,i,(num*i));
		}

	}

}
