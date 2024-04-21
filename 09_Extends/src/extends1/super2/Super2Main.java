package extends1.super2;

public class Super2Main {

	public static void main(String[] args) {
		// ClassC classC = new ClassC();

//		ClassA 생성자
//		ClassB 생성자 a = 10 b = 20
//		ClassC 생성자
		// ClassC의 생성자가 먼저 호출되지만, super(...)를 통해 ClassB(...)의 생성자를 호출
		// ClassB의 생성자도 ClassA()의 생성자를 가장 먼저 호출
		// 결과적으로 부모 -> 자식 순서 (부모의 데이터를 먼저 초기화하고 그 뒤 자식의 데이터를 초기화)

		ClassB classB = new ClassB(100);
		
//		ClassA 생성자
//		ClassB 생성자 a = 100 b = 0
//		ClassB 생성자 a = 100

	}

}
