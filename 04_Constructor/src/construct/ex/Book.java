package construct.ex;

public class Book {
	String title; // 제목
	String author; // 저자
	int page; // 페이지 수
	// TODO 코드를 완성하세요.

	Book() {
		// 기본 생성자
	}

	public Book(String title, String author) {
		this(title, author, 0); // title과 author만을 매개변수로 받는 생성자
	}

	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}

	public void displayInfo() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
	}
}