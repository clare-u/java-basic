package access;

public class Speaker {
	private int volume; // 외부에서 필드 값 접근을 막는다
	// 해당 클래스 내부에서만 호출 가능

	Speaker(int volume) {
		this.volume = volume; // 생성 시 초기 음량 지정
	}

	void volumeUp() {
		if (volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
		} else {
			volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}

	void volumeDown() {
		volume -= 10;
		System.out.println("volumeDown 호출");
	}

	void showVolume() {
		System.out.println("현재 음량: " + volume);
	}
}
