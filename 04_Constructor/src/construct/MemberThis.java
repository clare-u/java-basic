package construct;

public class MemberThis {

	String nameField;

	void initMember(String nameParameter) {
		this.nameField = nameParameter;
		// 코드 안에서 멤버 변수에 접근 시 무조건 this를 적는 코딩 스타일도 있다
	}
}
