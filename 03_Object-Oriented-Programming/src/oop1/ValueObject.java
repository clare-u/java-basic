package oop1;

public class ValueObject {

	int value;

	void add() {
		value++;
		System.out.println("숫자 증가 value = " + value);
	}

	// static을 붙이지 않는 이유 : 원칙적으로 메서드는 객체 생성 후 호출하도록
}