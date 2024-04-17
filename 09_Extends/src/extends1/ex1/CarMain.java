package extends1.ex1;

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
		
		// 둘의 공통 기능인 이동(move())이 보인다.
		// 이런 경우 상속 관계를 사용하는 것이 효과적이다.
	}

}
