package this_super;

public class Player {
	
	String name;
	int level;
	int atk;
	int hp;
	
	Player(){
		System.out.println("Player의 1번 생성자 호출!");
		System.out.println("this의 주소값: "+this);
		level = 1;
		atk = 5;
		hp = 50;
		
	}
	Player(String name){
		this();
		System.out.println("Player의 2번 생성자 호출!");
		System.out.println("this의 주소값: "+this);
//		this.level = 3;
//		atk = 5;
//		hp = 50;
		this.name = name;
	}
	
	
	
	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println(" #아이디 : "+name);
		System.out.println(" #레벨 : "+level);
		System.out.println(" #공격력 : "+atk);
		System.out.println(" #체력 : "+hp);
		System.out.println("이 메서드를 부르고 있는 객체의 이름 :" +this.name);
		
	}
	
	
	
	
	
}
