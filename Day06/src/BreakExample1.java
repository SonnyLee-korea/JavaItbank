
public class BreakExample1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i>7) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println("\n반복문 종료");
		
		/*
		- 내부 반목문에 포함된 break로 바깥쪽 반복문까지 한번에
		종료시키고 싶다면 바깥쪽 반복문에 label를 붙입니다.
		 */
		
		
		outer:for(int i =0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				if(i==j) {
					break outer;
				}
				
				System.out.println(i+"-"+j);
			}
		}
		
		
		
		
		
		
		

	}

}
