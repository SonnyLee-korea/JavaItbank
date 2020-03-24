
public class Identifier {

	public static void main(String[] args) {
		
		//꼭 지켜야 할 규칙(안 지킬 경우 에러가 발생합니다.)
		//1. 식별자의 이름은 중복을 허용하지 않습니다.
		//2. 대 소문자를 철저하게 구분합니다.
		
		int age = 30;
//		int age = 40;
		
		int Age = 40;
		System.out.println(age);
		System.out.println(Age);
		
		//3. 식별자 이름은 숫자로 지정하거나 숫자로 시작해서는 안됩니다.
//		int 700 = 365;
//		int 7number = 7;
		int number7 = 7;
		int num7ber = 7;
		
		//4. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day= 19921013;
		int mybirthday = 19921013;
		int myBirthDay = 19921013;
		
		//5. 식별자 이름에 쓸 수 있는 특수문자는 밑줄(_), 달러기호($)
		//하지만 사용을 권장하지는 않습니다.
		String $hello_ = "안녕";
		
		//6. 키워드(예약어)는 식별자 이름으로 지정이 불가능합니다.
//		String class ="클래스";
		String className = "클래스";
		
		//7. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//하지만 사용을 권장하지는 않습니다.
		int 숫자 = 10;
		System.out.println(숫자);
		
		
		
	}

}
