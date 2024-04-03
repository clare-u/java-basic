package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력할 주문의 개수를 입력하세요: ");
		int n = sc.nextInt();
		sc.nextLine(); // 개행 제거

		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] orders = new ProductOrder[n];

		// createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
		for (int i = 0; i < orders.length; i++) {
			System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

			System.out.println("상품명: ");
			String productName = sc.nextLine();

			System.out.println("가격: ");
			int price = sc.nextInt();

			System.out.println("수량: ");
			int quantity = sc.nextInt();
			sc.nextLine(); // 입력 버퍼를 비우기 위한 코드

			orders[i] = createOrder(productName, price, quantity);
		}
		// printOrders()를 사용해서 상품 주문 정보 출력
		printOrders(orders);
		// getTotalAmout()를 사용해서 총 결제 금액 계산
		// 총 금액 출력
		System.out.println("총 결제 금액: " + getTotalAmount(orders));

//		입력할 주문의 개수를 입력하세요: 3
//		1번째 주문 정보를 입력하세요.
//		상품명: 
//		두부
//		가격: 
//		2000
//		수량: 
//		2
//		2번째 주문 정보를 입력하세요.
//		상품명: 
//		김치
//		가격: 
//		5000
//		수량: 
//		1
//		3번째 주문 정보를 입력하세요.
//		상품명: 
//		콜라
//		가격: 
//		1500
//		수량: 
//		2

//		상품명: 두부, 가격: 2000, 수량: 2
//		상품명: 김치, 가격: 5000, 수량: 1
//		상품명: 콜라, 가격: 1500, 수량: 2
//		총 결제 금액: 12000

	} // main

	static ProductOrder createOrder(String productName, int price, int quantity) {
		ProductOrder order = new ProductOrder();
		order.productName = productName;
		order.price = price;
		order.quantity = quantity;
		return order;
	}

	static void printOrders(ProductOrder[] orders) {
		for (ProductOrder o : orders) {
			System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
		}

	}

	static int getTotalAmount(ProductOrder[] orders) {
		int totalAmount = 0;
		for (ProductOrder order : orders) {
			totalAmount += order.price * order.quantity;
		}
		return totalAmount;
	}

}
