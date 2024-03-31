package ref;

public class NullMain2 {

	// 주소가 없는 곳을 찾아갈 때 발생하는 예외
	public static void main(String[] args) {
		Data data = null;
		data.value = 10; // NullPointerException 예외 발생
	}

}
