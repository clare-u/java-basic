package extends1.overriding;

public class ElectricCar extends Car {

	// 메서드 오버라이딩
	// 부모에게서 상속 받은 기능을 자식이 재정의하는 것
	// @: 어노테이션, 프로그램이 읽을 수 있는 특별한 주석
	@Override
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}
	// 메서드 이름은 같지만 새로운 기능을 사용하고 싶을 때 사용

	public void charge() {
		System.out.println("충전합니다.");
	}

}
