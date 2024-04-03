package ref;

public class VarChange1 {
	public static void main(String[] args) {
		// 자바는 항상 변수의 값을 복사해서 대입한다.

		int a = 10;
		int b = a;

		System.out.println("a = " + a); // 10
		System.out.println("b = " + b); // 10

		// a 변경
		a = 20;
		System.out.println("변경 a = 20");
		System.out.println("a = " + a); // 20
		System.out.println("b = " + b); // 10

		// b 변경
		a = 20;
		System.out.println("변경 a = 30");
		System.out.println("a = " + a); // 20
		System.out.println("b = " + b); // 30

	}
}
