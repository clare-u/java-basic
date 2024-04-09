package construct;

public class MemberInit {

	String name;
	int age;
	int grade;

	// 추가
	void initMember(String name, int age, int grade) {
		// Member에 초기값 설정 기능을 제공하는 메서드

		// 멤버 변수 이름과 메서드의 매개변수의 이름이 같아도 둘을 구분 가능하다.
		// 멤버 변수에 접근하려면 앞에 this.라고 해주면 된다
		// this는 인스턴스 자신의 참조값을 뜻함

		this.name = name; // 내 멤버변수 name에 지역변수 name 넣기
		this.age = age; // 내 멤버변수 age에 지역변수 age 넣기
		this.grade = grade; // 내 멤버변수 grade에 지역변수 grade 넣기

		// member 객체의 멤버변수를 사용하므로 MemberInit이 메서드까지 제공
	}
}
