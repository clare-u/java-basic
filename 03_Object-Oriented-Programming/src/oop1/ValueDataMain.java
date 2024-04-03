package oop1;

public class ValueDataMain {
	
	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		
		add(valueData);
		add(valueData);
		add(valueData);
		
//		숫자 증가 value = 1
//		숫자 증가 value = 2
//		숫자 증가 value = 3
		
	} // main
	
	static void add(ValueData valueData) {
		valueData.value++;
		System.out.println("숫자 증가 value = " + valueData.value);
	}
}
