package extends1.super2;

public class ClassC extends ClassB {
	// ClassB를 상속받음
	public ClassC() {
		super(10, 20); // 기본생성자가 없어서 직접 매개변수를 넣고 작성해주어야 함
		// 생성자는 하나만 호출 가능해서 두 생성자 중 하나를 선택
		System.out.println("ClassC 생성자");
	}

}
