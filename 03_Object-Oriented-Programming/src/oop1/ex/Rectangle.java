package oop1.ex;

public class Rectangle {

	int width;
	int height;

	int calculateArea() {
		return width * height;
	} // 메서드들은 자신의 멤버변수를 사용하기 때문에 매개변수가 필요 없음

	int calculatePerimeter() {
		return 2 * (width + height);
	}

	boolean isSquare() {
		return this.width == this.height;
	}

}
