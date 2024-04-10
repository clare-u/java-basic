package construct;

public class MemberDefault {
	String name;
	
	public MemberDefault() {
		// 생략되어도 자바가 기본 생성자는 있는 걸로 쳐줌
		// 단, 다른 생성자가 하나라도 있으면 기본 생성자를 만들어주지는 않음
		
		// 기본 생성자: 직접 생성도 가능하다
		System.out.println("생성자 호출");
	}
}
