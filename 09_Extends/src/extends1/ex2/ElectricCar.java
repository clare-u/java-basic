package extends1.ex2;

public class ElectricCar extends Car {
// 부모의 기능을 자식이 물려받는 상속 구조
// 자식은 부모 클래스에 대해 적혀있지만, 반대로 부모 코드에는 자식에 대한 정보가 하나도 없다.
// 다이어그램의 화살표 -> : 클래스가 알고 있다는 의미
	public void charge() {
		System.out.println("충전합니다.");
	}

}
