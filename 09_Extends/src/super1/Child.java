package super1;

public class Child extends Parent {
	public String value = "child";

	@Override
	public void hello() {
		System.out.println("Child.hello");
	}

	public void call() {
		System.out.println("this value = " + this.value); // this 생략 가능
		System.out.println("super value = " + super.value);

		this.hello(); // this 생략 가능
		super.hello();
		// super를 사용한 경우 부모 클래스의 기능을 사용
	}
}
