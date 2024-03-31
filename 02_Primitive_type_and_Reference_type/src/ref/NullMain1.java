package ref;

public class NullMain1 {

	// 택배를 보낼 때 주소지가 아직 결정되지 않아서 주소지가 결정될 때 까지는 주소지를 비워두어야 할 수 있다.
	// 참조형 변수에는 항상 객체의 주소지인 참조값이 들어간다.
	// 그런데 아직 가리키는 대상이 없다면, 특별한 값인 null을 넣어둘 수 있다. (값이 존재하지 않는, 없다는 뜻)

	public static void main(String[] args) {
		Data data = null;
		System.out.println("1. data = " + data);
		// 1. data = null (아직 가리키는 객체가 없다는 뜻)

		data = new Data();
		System.out.println("2. data = " + data);
		// 2. data = ref.Data@3f99bd52 (이제 참조할 객체가 존재한다)
		// 이 때 멤버변수인 value도 0으로 초기화된다.

		data = null;
		System.out.println("3. data = " + data);
		// 3. data = null
		// 인스턴스를 아무도 참조하지 않으므로, 참조값을 다시 구할 방법이 없다(해당 인스턴스에 다시 접근할 방법이 없다)
		// JVM이 GC를 사용해 제거한다
	}
}
