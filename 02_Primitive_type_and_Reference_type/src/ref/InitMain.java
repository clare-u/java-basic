package ref;

public class InitMain {
	public static void main(String[] args) {
		InitData data = new InitData();

		System.out.println("value1 = " + data.value1);
		System.out.println("value2 = " + data.value2);

		// value1 = 0 // 멤버 변수는 자동으로 초기화 된다.
		// value2 = 10 // 지정해 둔 초기값으로 초기화 된다.
	}
}
