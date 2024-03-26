package ref;

public class Method1 {
	public static void main(String[] args) {
		// 기존 코드 리팩토링

		Student student1 = new Student();
		// 참조형 객체: 메서드를 호출 시 참조값을 전달
		// -> 메서드 내부에서는 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 사용 가능하다ㅏ.
		initStudent(student1, "학생1", 15, 90);

		Student student2 = new Student();
		initStudent(student2, "학생2", 16, 80);

		printStudent(student1); // 이름: 학생1 나이: 15 성적: 90
		printStudent(student2); // 이름: 학생2 나이: 16 성적: 80

	} // main

	static void initStudent(Student student, String name, int age, int grade) {
		// 전달한 학생 객체의 필드에 값을 설정
		student.name = name;
		student.age = age;
		student.grade = grade;
	}

	static void printStudent(Student student) {
		// 전달한 학생 객체의 필드 값을 읽어서 출력
		System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
	}
}