package class1.ex;

public class MovieReviewMain {
	public static void main(String[] args) {
		// 영화 리뷰 정보 선언
		MovieReview m1 = new MovieReview();
		m1.title = "인셉션";
		m1.review = "인생은 무한 루프";

		MovieReview m2 = new MovieReview();
		m2.title = "어바웃 타임";
		m2.review = "인생 시간 영화!";

		MovieReview[] movies = { m1, m2 };

		// 영화 리뷰 정보 출력
		for (MovieReview m : movies) {
			System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
		}

	}

}
