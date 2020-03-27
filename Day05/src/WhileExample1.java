
public class WhileExample1 {

	public static void main(String[] args) {
		//1~10까지의 누적합을 구하는 로직.
		int total = 0; // 누적합을 담아줄 변수.
		int n = 1;
		
		while(n<11) { //논리형 조건식: 반복문의 끝을 지정(end)
			total+=n;
			n++; //증감식: 반목문의 종료를 위해 제어변수의 값을 조정.(step)
		}
		System.out.println("1~10까지의 누적합:"+total);

	}

}
