import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		//정수로 이루어진 문자열을 실제 정수로 변환하는 메서드
		//Inerger.parseInt(문자열 or 문자열이 들어있는 변수)
		
//		String s1 = "10";
//		String s2 = "34";
//
//		System.out.println(s1+s2);
//		
//		int i1 =Integer.parseInt(s1);
//		int i2 =Integer.parseInt(s2);
//		System.out.println(i1+i2);
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("***가위 바위 보 게임***");
			System.out.print("코인을 투입해 주세요 <넣으실 코인의 숫자를 입력해 주세요>");
			int coin = sc.nextInt();
			int win = 0;
			int lose = 0;
			int draw = 0;
			boolean bool=true;
			System.out.println();
			
			
			System.out.println("해당하는 메뉴의 숫자를 입력해 주세요.");
			while(bool) {
			System.out.println("-------------------");
			System.out.printf("현재 코인 수: %d",coin);
			System.out.println();
			System.out.println("-------------------");
			System.out.println("#1. 가위바위보 게임 시작");
			System.out.println("#2. 전적 보기");
			System.out.println("#3. 코인 투입하기");
			System.out.println("#4. 프로그램 종료");
			System.out.println("-------------------");
			System.out.print(">");
			int menu = sc.nextInt();
			System.out.println();
			
			if(menu==1) {

				boolean bool_=true;
				
				while(bool_) {
					
				if(coin==0) {
					System.out.println("-----------");
					System.out.println("코인이 없습니다");
					System.out.println("-----------");
					bool_=false;
				}
					
				else if(coin!=0) {
					System.out.println("가위, 바위, 보 중에 하나를 입력하세요.");
					System.out.println("게임을 끝내고 싶으시다면 '그만' 이라고 입력하세요");
					String mine = sc.next();
					int computer = (int)(Math.random()*3)+1;
					String hand = null;
					if(mine.equals("그만")){
						bool_=false;
						continue;
					}
					
					
					if(computer==1) {
						hand="가위";
					}else if(computer==2) {
						hand="바위";
					}else if(computer==3) {
						hand="보";
					}
					if(hand.equals(mine)) {
						System.out.println("비겼습니다.");
						System.out.println("남은 코인: "+(coin-1));
						draw+=1;
					}
					else if(mine.equals("바위") && hand.equals("가위")) {
						System.out.println("이겼습니다.");
						System.out.println("남은 코인: "+(coin-1));
						win+=1;
					}
					else if(mine.equals("바위") && hand.equals("보")) {
						System.out.println("졌습니다.");
						System.out.println("남은 코인: "+(coin-1));
						lose+=1;
					}
					else if(mine.equals("가위") && hand.equals("바위")) {
						System.out.println("졌습니다.");
						System.out.println("남은 코인: "+(coin-1));
						lose+=1;
					}
					else if(mine.equals("가위") && hand.equals("보")) {
						System.out.println("이겼습니다.");
						System.out.println("남은 코인: "+(coin-1));
						win+=1;
					}
					else if(mine.equals("보") && hand.equals("바위")) {
						System.out.println("이겼습니다.");
						System.out.println("남은 코인: "+(coin-1));
						win+=1;
					}
					else if(mine.equals("보") && hand.equals("가위")) {
						System.out.println("졌습니다.");
						System.out.println("남은 코인: "+(coin-1));
						lose+=1;
					}
					
				coin-=1;
				if(coin==0) {
					System.out.println("코인이 다 떨어졌습니다.");
					System.out.println("게임을 계속 하시려면 코인을 더 넣어주세요.");
					System.out.println("게임을 그만 두고 메뉴로 돌아가시려면 '그만' 이라고 입력해주세요.");
					String coinPlus= sc.next();
					if(coinPlus.equals("그만")) {
						bool_=false;
					}
					else {
						coin+=Integer.parseInt(coinPlus);
					}
				}
				
				}
			}
			}
			
			
			
			else if(menu==2) {
				System.out.println("*** 게임 결과 ***");
				System.out.println("이긴 횟수: "+win+"회");
				System.out.println("비긴 횟수: "+draw+"회");
				System.out.println("진 횟수: "+lose+"회");
			}
			
			else if(menu==3) {
				System.out.println("코인을 넣어주세요");
				int coinPlusPlus= sc.nextInt();
				coin+=coinPlusPlus;
			}
			
			
			
			else if(menu==4) {
				System.out.println("프로그램을 종료합니다. [Y / N]");
				String end = sc.next();
				if(end.equals("y") ||end.equals("Y")) {
					bool=false;
				}
				else {
					System.out.println("종료를 취소합니다.");
				}
				
			}
			
			
		}//outer while true
			sc.close();
			

	} //end main

} //end class
