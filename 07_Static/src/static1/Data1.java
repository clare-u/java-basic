package static1;

public class Data1 {

	public String name;
	public int count;

	public Data1(String name) {
		this.name = name;
		count++; // 생성된 객체의 수를 세기 위해 생성자를 통해 멤버 변수 값을 증가시킨다
		
	}
}
