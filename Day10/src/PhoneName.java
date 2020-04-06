
public class PhoneName {

	public static void main(String[] args) {
		
		Phone basic = new Phone();
		basic.showSpec();
		
		System.out.println("------------------------");
		
		Phone galaxys20 = new Phone("갤럭시 s20");
		galaxys20.showSpec();
		
		System.out.println("------------------------");
		
		Phone iPhone11 = new Phone("아이폰 11","화이트");
		iPhone11.showSpec();
		
		
		System.out.println("------------------------");
		
		Phone iPhone12 = new Phone("아이폰 12","골드",3000000);
		iPhone12.showSpec();
		
	}

}
