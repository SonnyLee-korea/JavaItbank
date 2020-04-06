
public class PenMain {

	public static void main(String[] args) {
		
		// 펜의 기능과 속성들을 사용하려면 설계도(class)를
		// 바탕으로 펜 객체를 생성하셔야 합니다.
		
		// 객체 생성 문법: 클래스타입 변수명 = new 클래스이름();
		Pen redPen = new Pen();
		
		// 참조 연산자(.)를 통해 객체의 속성과 기능을
		// 사용할 수 있습니다.
		redPen.color = "red";
		redPen.price = 500;
		redPen.write();
		redPen.priceInfo();
		
		Pen bluePen = new Pen();
		bluePen.color = "blue";
		bluePen.price = 600;
		bluePen.write();
		bluePen.priceInfo();
		
		
		System.out.println("----------------");
		System.out.println(redPen);
		System.out.println(bluePen);
	}

}
