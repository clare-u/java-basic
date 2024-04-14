package static2;

public class DecoMain2 {

	public static void main(String[] args) {
		String s = "hello java";
		String deco = DecoUtil2.deco(s); // 정적 메서드 호출

		System.out.println("before: " + s);
		System.out.println("after: " + deco);

//		before: hello java
//		after: *hello java*
	}
}
