package construct;

public class MemberThis {

	String nameField;

	void initMember(String nameParameter) {
		nameField = nameParameter; // 이름이 다르면 this가 생략되었다고 보면 된다
	}
}
