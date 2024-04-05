package oop1;

/**
 * 객체 지향
 */
public class MusicPlayerMain4 {

	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();

		// 음악 플레이어 켜기
		mp.on();

		// 볼륨 증가
		mp.volumeUp();
		// 볼륨 증가
		mp.volumeUp();
		// 볼륨 감소
		mp.volumeDown();

		// 음악 플레이어 상태
		mp.showStatus();

		// 음악 플레이어 끄기
		mp.off();

//		음악 플레이어를 시작합니다.
//		음악 플레이어 볼륨: 1
//		음악 플레이어 볼륨: 2
//		음악 플레이어 볼륨: 1
//		음악 플레이어 상태 확인
//		음악 플레이어 ON, 볼륨: 1
//		음악 플레이어를 종료합니다.
	}
}