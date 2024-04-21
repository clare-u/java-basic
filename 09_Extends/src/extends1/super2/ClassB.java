package extends1.super2;

public class ClassB extends ClassA {
	// ClassA를 상속받음
	public ClassB(int a) {
		this(a, 0); // 자신의 생성자를 this로 넘기더라도 언젠가 한 번은 super()로 부모를 꼭 호출해줘야 한다
		System.out.println("ClassB 생성자 a = " + a);
	}

	public ClassB(int a, int b) {
		super(); // 기본 생성자 생략 가능
		System.out.println("ClassB 생성자 a = " + a + " b = " + b);
	}

}
