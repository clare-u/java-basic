package final1;

public class ConstantMain2 {

	public static void main(String[] args) {
		// 상수를 사용해서 매직 넘버 문제를 해결하고 유지 보수 용이하게 만듦
		System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
		int currentUserCount = 999;

		process(currentUserCount++);
		process(currentUserCount++);
		process(currentUserCount++);

//		프로그램 최대 참여자 수 2000
//		참여자 수: 999
//		게임에 참여합니다.
//		참여자 수: 1000
//		게임에 참여합니다.
//		참여자 수: 1001
//		게임에 참여합니다.

	}

	private static void process(int currentUserCount) {
		System.out.println("참여자 수: " + currentUserCount);
		if (currentUserCount > Constant.MAX_USERS) {
			System.out.println("대기자로 등록합니다.");
		} else {
			System.out.println("게임에 참여합니다.");
		}

	}

}
