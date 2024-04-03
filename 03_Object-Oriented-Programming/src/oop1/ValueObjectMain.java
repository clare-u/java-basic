package oop1;

public class ValueObjectMain {

	public static void main(String[] args) {
		ValueObject valueObject = new ValueObject();
		valueObject.add();
		valueObject.add();
		valueObject.add();
		System.out.println("최종 숫자 = " + valueObject.value);

//		숫자 증가 value = 1
//		숫자 증가 value = 2
//		숫자 증가 value = 3
//		최종 숫자 = 3

	}

}
