package ref;

public class Method2 {
	public static void main(String[] args) {
		// Method1 코드 리팩토링

		Student student1 = createStudent("학생1", 15, 90);
		Student student2 = createStudent("학생2", 16, 80);

		//

		printStudent(student1);
		printStudent(student2);

	} // main

	static Student createStudent(String name, int age, int grade) {
		Student student = new Student();
		student.name = name;
		student.age = age;
		student.grade = grade;
		return student; // 메서드 내에서 객체를 생성했기 때문에, 만들어진 객체를 메서드 밖에서 사용 가능하도록 돌려주어야 한다.
	}

	static void printStudent(Student student) {
		System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
	}
}