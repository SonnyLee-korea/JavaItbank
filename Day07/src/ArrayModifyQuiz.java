import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 배열을 선언하시고 무지,네오,어피치,라이언,제이지를 
		 저장하세요.(String[])
		 2. 사용자에게 수정할 친구 이름을 입력받아서 입력한 친구가 배열에 존재한다면
		 수정할 값을 다시 입력받으세요.
		 3. 이름을 수정한 후에 "수정 후 결과: ~~~"를 출력하세요
		 4.사용자가 입력한 이름이 배열에 없다면 "xxx은 없는 이름입니다."
		 */
		
		String[] kakao = {"무지","네오","어피치","라이언","제이지"};
		System.out.println("현재 저장된 이름:"+Arrays.toString(kakao));
		System.out.print("수정하고 싶은 이름을 적어주세요:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String thisName;
		int i;
		for(i =0;i<kakao.length;i++) {
			if(name.equals(kakao[i])) {
				System.out.print("수정할 내용을 입력해주세요:");
				thisName = sc.next();
				System.out.println(kakao[i]+"의 이름을 변경합니다");
				kakao[i]=thisName;
				System.out.println("변경완료!!");
				System.out.println(Arrays.toString(kakao));
				break;
			}else if(i==kakao.length-1) {
				System.out.println("입력하신 이름은 없습니다");
			}	
		}
		sc.close();
		
		

	}

}
