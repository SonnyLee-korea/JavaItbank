import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		
		String[] kakao = {"무지","네오","어피치","라이언","제이지"};
		System.out.println("현재 저장된 이름:"+Arrays.toString(kakao));
		System.out.print("삭제하고 싶은 이름을 적어주세요:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		/*
		 1. 삭제할 이름을 입력받아서 해당 값을 삭제해 주세요
		 2. 삭제후 정보도 출력해주세요
		 3. 없으면 없는 이름이라고도 출력해주세요
		 */
		String[] new_room = new String[kakao.length-1];
		
		int i;
		
		for(i=0 ; i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				System.out.println(kakao[i]+"의 이름을 삭제합니다.");
				for(int j=i; j<kakao.length-1;j++) {
					kakao[j]=kakao[j+1];
					
				}
				for(int k =0; k<new_room.length;k++) {
					new_room[k]=kakao[k];
				}
				kakao=new_room;
				new_room=null;
				System.out.println(Arrays.toString(kakao));
				break;			
			}
			
			else if(i==kakao.length-1) {
				System.out.println("입력하신 이름은 없습니다.");
			}
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
