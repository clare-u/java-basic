package construct;

public class MemberConstruct {

	// 프로그래밍을 하다 보면 객체 생성 이후 바로 초기값을 할당해야 하는 경우가 많다.
	// 그래서 대부분의 객체지향언어는 생성자라는 기능을 제공한다.
	// 생성자는 앞의 initMember(...) 메서드와 유사하지만 몇 가지 다른 특징이 있다.

	String name;
	int age;
	int grade;

	// 생성자 특징
	// 1. 이름이 클래스명과 동일해야 한다 (첫 글자 대문자로 시작)
	// 2. 반환 타입이 없다 (비워두어야 한다)
	// 3. 나머지는 메서드와 같다
	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// 생성자 추가 (오버로딩)
	MemberConstruct(String name, int age) {
		// 이름과 나이만 매개변수로 받는 생성자
		this(name, age, 50); // this() 사용
		// this() : 자기 자신의 생성자를 호출
	}
}
