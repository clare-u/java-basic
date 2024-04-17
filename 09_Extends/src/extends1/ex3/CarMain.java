package extends1.ex3;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		electricCar.openDoor();
//		차를 이동합니다.
//		충전합니다.
//		문을 엽니다.

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();
//		차를 이동합니다.
//		기름을 주유합니다.
//		문을 엽니다.

		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.fillHydrogen();
		hydrogenCar.openDoor();
//		차를 이동합니다.
//		수소를 충전합니다.
//		문을 엽니다.

		// 모든 차가 새로운 기능을 물려받는다.
	}

}
