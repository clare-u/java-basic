package access.a;

public class AccessData {
	// public, default, private을 필드와 메서드에 사용했다.
	
	public int publicField;
	int defaultField;
	private int privateField;

	public void publicMethod() {
		System.out.println("publicMethod 호출 " + publicField);
	}

	void defaultMethod() {
		System.out.println("defaultMethod 호출 " + defaultField);
	}

	private void privateMethod() {
		System.out.println("privateMethod 호출 " + privateField);
	}

	public void innerAccess() { // 본인 클래스 내에서는 모두 접근 가능
		System.out.println("내부 호출");
		publicField = 100;
		defaultField = 200;
		privateField = 300;
		publicMethod();
		defaultMethod();
		privateMethod();

	}

}
