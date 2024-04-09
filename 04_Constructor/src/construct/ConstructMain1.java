package construct;

public class ConstructMain1 {
	public static void main(String[] args) {
		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

		MemberConstruct[] members = { member1, member2 };

		for (MemberConstruct s : members) {
			System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
		}
		
//		생성자 호출 name=user1, age=15, grade=90
//		생성자 호출 name=user2, age=16, grade=80
//		이름:user1 나이:15 성적:90
//		이름:user2 나이:16 성적:80
	}

}
