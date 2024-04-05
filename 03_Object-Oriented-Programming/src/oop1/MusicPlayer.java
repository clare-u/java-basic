package oop1;

public class MusicPlayer {
	// 음악 플레이어라는 개념을 객체로 온전히 만들어보자.
	// 음악 플레이어라는 객체를 지향해보자.

	// 속성 : volume, isOn
	int volume = 0;
	boolean isOn = false;

	// 기능: on(), off(), volumeUp(), volumeDown(), showStatus()
	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다");
	}

	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다");
	}

	void volumeUp() {
		volume++;
		System.out.println("음악 플레이어 볼륨:" + volume);
	}

	void volumeDown() {
		volume--;
		System.out.println("음악 플레이어 볼륨:" + volume);
	}

	void showStatus() {
		System.out.println("음악 플레이어 상태 확인");
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨:" + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
	}

}
