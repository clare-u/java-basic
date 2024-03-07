package class1;

public class ClassStart3 {
	public static void main(String[] args) {
		Student student1;
		// 학생을 담아둘 수 있는 변수를 선언 (1번 학생)
		student1 = new Student(); // 학생을 실제 메모리에 만듬
		// 메모리에 학생을 만들어서 쓸 수 있게 되고, student1변수명으로 사용
		student1.name = "학생1";
		// 클래스에서는 .을 통해 멤버변수에 접근 (배열에서 []로 접근했듯이)
		student1.age = 15;
		student1.grade = 20;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		System.out.println(student1);
		System.out.println(student2);
		
//		class1.Student@7a81197d
//		class1.Student@5ca881b5
		
		System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
		// 스튜던트1번의 이름, 나이, 성적에 접근해서 출력
		System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
		
//		이름: 학생1 나이: 15 성적: 20
//		이름: 학생2 나이: 16 성적: 80
	}
}