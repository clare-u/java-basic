package ref;

public class VarChange2 {
	public static void main(String[] args) {
		Data dataA = new Data();
		dataA.value = 10;
		Data dataB = dataA;
		// 인스턴스가 만들어져서 복사되는 게 아닌, 참조값만 B에 들어가는 것
		// 즉 객체는 하나고, 같은 객체를 참조

		System.out.println("dataA 참조값 = " + dataA);
		System.out.println("dataB 참조값 = " + dataB);

		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);
		// 두 줄 모두 ref.Data@6f2b958e.value 한 것과 같음

		// dataA 변경
		dataA.value = 20;
		System.out.println("변경 dataA.value = 20");
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);

		// dataB 변경
		dataB.value = 30;
		System.out.println("변경 dataB.value = 30");
		System.out.println("dataA.value = " + dataA.value);
		System.out.println("dataB.value = " + dataB.value);

		// 실행결과
//		dataA 참조값 = ref.Data@6f2b958e
//		dataB 참조값 = ref.Data@6f2b958e
//		dataA.value = 10
//		dataB.value = 10
//		변경 dataA.value = 20
//		dataA.value = 20
//		dataB.value = 20
//		변경 dataB.value = 30
//		dataA.value = 30
//		dataB.value = 30
	}
}
