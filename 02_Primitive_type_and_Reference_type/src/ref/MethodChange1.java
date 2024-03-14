package ref;

public class MethodChange1 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("메서드 호출 전: a= " + a);
		changePrimitive(a);
		System.out.println("메서드 호출 후: a= " + a);

		// 이 코드는 int x = a; 로 해석이 가능하다.
		// x, a 각각 10을 가지고 있다가, 메소드가 호출되면 x만 20으로 변경

//		메서드 호출 전: a= 10
//		메서드 호출 후: a= 10

	} // main

	static void changePrimitive(int x) {
		x = 20;
		// 메서드가 종료되면 매개변수 x는 제거된다.
	} // changePrimitive()

}
