package inherit.good;

/*
 - 메서드 재정의  규칙
 1. 반드시 상속을 전제로 해야합니다.
 2. 반드시 반환 유형이 같아야 합니다.
 3. 메서드 이름이 같아야 합니다.
 
 */


public class MainClass {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		w1.name = "전사1";
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.rage = 60;
		w1.characterInfo();
		System.out.println("-------------------");
		
		Mage m1 = new Mage();
		m1.name = "법사1";
		m1.level = 1;
		m1.atk = 3;
		m1.hp =50;
		m1.mana = 70;
		m1.characterInfo();
		System.out.println("-------------------");
		
		
		Hunter h1 = new Hunter();
		h1.name = "헌터1";
		h1.level = 1;
		h1.atk = 5;
		h1.hp = 60;
		h1.pet = "pet1";
		h1.characterInfo();
		
	}
	

}
