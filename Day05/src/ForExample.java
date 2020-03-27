
public class ForExample {

	public static void main(String[] args) {
		
		
		//1~10까지의 누적합
//		int n=1;
//		int total=0;
//		while(n<=10) {
//			total+=n;
//			n++;		
//		}
//		System.out.println(total);
//		
//		int total=0;
//		for(int i=1 ; i<=10 ; i++ ) {
//			total+=i;;
//		}
//		System.out.println(total);
//		
//		for(int i =1 ; i<=200; i++) {
//			if(i%6==0 && i%12!=0) {
//				System.out.print(i+" ");
//			}
//		}
		
		
		int count=0;
		for(int i =1; i<=60000; i++) {
			if(i%177==0) {
				count+=1;
			}
		
		}
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
