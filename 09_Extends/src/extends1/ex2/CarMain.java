package extends1.ex2;

public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();

//		차를 이동합니다.
//		충전합니다.
//		차를 이동합니다.
//		기름을 주유합니다.
		
		// 상속시키니 기존과 똑같이 동작한다.
	}

}
