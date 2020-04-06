
public class Bread {
	
	String name;
	int price;
	
	Bread(){} //기본생성자는 기본적으로 하나는 만들어 놓자.
	
	Bread(String bName, int bPrice){
		name=bName;
		price=bPrice;
	}
	
	void breadInfo() {
		System.out.println("빵 이름: "+name);
		System.out.println("빵 가격: "+price);
	}

}
