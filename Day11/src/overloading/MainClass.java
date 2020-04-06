package overloading;

public class MainClass {

	public static void main(String[] args) {
		
		
		/*
		 - Calculator 클래스에 calcRectArea() 메서드를 선언하여
		 길이를 하나만 전달하면 정사각형의 넓이를 리턴해 주고,
		 길이를 두개(가로,세로) 전달하면 직사각형의 넓이를 리턴해 주도록 
		 오버로딩을 사용하여 메서드를 선언하세요
		 
		 MainClass에서 직접 메서드를 호출을 진행해 보세요.
		 (길이가 5인 정사각형의 넓이, 가로10 세로 20인 직사각형의 넓이)
		 */
		
		
		Calculator cal = new Calculator();
		cal.calcRectArea(5);
		cal.calcRectArea(10, 20);
		
	}

}
