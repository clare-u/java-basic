package access.a;

public class AccessInnerMain {
	public static void main(String[] args) {
		AccessData data = new AccessData();

		// public 호출 가능
		data.publicField = 1;
		data.publicMethod(); // publicMethod 호출 1

		// 같은 패키지 -> default 호출 가능
		data.defaultField = 2;
		data.defaultMethod(); // defaultMethod 호출 2

		// private 호출 불가 (AccessData 내부에서만 접근 가능)
		// data.privateField = 3;
		// data.privateMethod();

		data.innerAccess(); // public 메서드이므로 외부에서 이너엑세스 호출 가능
//		내부 호출
//		publicMethod 호출 100
//		defaultMethod 호출 200
//		privateMethod 호출 300
	
	}

}
