package static2;

public class DecoMain1 {

	public static void main(String[] args) {
		String s = "hello java";
		DecoUtil1 utils = new DecoUtil1(); // 메서드 사용을 위해 인스턴스 생성 필요
		String deco = utils.deco(s);

		System.out.println("before: " + s);
		System.out.println("after: " + deco);
		
//		before: hello java
//		after: *hello java*
	}
}
