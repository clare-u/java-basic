package access;

public class SpeakerMain {
	public static void main(String[] args) {
		Speaker speaker = new Speaker(90); // 초기음량은 90
		speaker.showVolume(); // 현재 음량: 90

		speaker.volumeUp(); // 음량을 10 증가합니다.
		speaker.showVolume(); // 현재 음량: 100

		speaker.volumeUp(); // 음량을 증가할 수 없습니다. 최대 음량입니다.
		speaker.showVolume(); // 현재 음량: 100

		// 필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
		// speaker.volume = 200; // private 접근 오류
		// The field Speaker.volume is not visible
		speaker.showVolume();
	}

}
