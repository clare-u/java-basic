package ref;

public class MethodChange2 {

	public static void main(String[] args) {
		// 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
		// -> 메서드 내부에서 매개변수로 전달된 객체의 멤버변수를 변경하려고 접근 시 그 객체는 호출자의 객체이다.

		Data dataA = new Data();
		dataA.value = 10;

		System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
		changeReference(dataA);
		System.out.println("메서드 호출 후: dataA.value = " + dataA.value);

//		메서드 호출 전: dataA.value = 10
//		메서드 호출 후: dataA.value = 20

		// 메서드 호출 시 변수 dataA, dataX 둘 다 같은 참조값인 x001을 가지게 된다
		// dataX를 통해서도 x001에 있는 Data 객체에 접근 가능하다.

	} // main

	static void changeReference(Data dataX) {
		dataX.value = 20;
		// 참조값을 통해 x001 객체에 접근하고 그 안의 value의 값을 20으로 변경
		// 메서드 종료 시 dataX를 통해서는 객체에 접근 불가능
	}

}
