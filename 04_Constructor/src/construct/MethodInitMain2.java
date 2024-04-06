package construct;

public class MethodInitMain2 {

	public static void main(String[] args) {
		MemberInit member1 = new MemberInit();
		initMember(member1, "user1", 15, 90);

		MemberInit member2 = new MemberInit();
		initMember(member2, "user2", 16, 80);

		MemberInit[] members = { member1, member2 };

		for (MemberInit s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
		
//		이름:user1 나이:15 성적:90
//		이름:user2 나이:16 성적:80

	} // main

	static void initMember(MemberInit member, String name, int age, int grade) {
		member.name = name;
		member.age = age;
		member.grade = grade; 
		// member 객체의 멤버변수를 사용하므로 이런 경우 MemberInit이 메서드까지 제공하는 게 좋다
	}

}
