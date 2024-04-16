package final1;

public class FinalLocalMain {
	
	public static void main(String[] args) {
		//final은 값이 한 번 세팅되면 끝이다 
		
		// final 지역 변수
		final int data1;
		data1 = 10; // 최초 한번만 할당 가능
		// data1 = 20; // 컴파일 오류
		// The final local variable data1 may already have been assigned
	
		// final 지역 변수2
		final int data2 = 10;
		// data2 = 20; // 컴파일 오류
		
		method(10);
	
	}
	
	static void method(final int parameter) {
		// parameter = 20; // 컴파일 오류 
		// 파라미터의 값을 바꾸지 못한다. 넘긴 최초 값으로 고정된다
	}

}
