package class1.ex;

public class ProductOrderMain {
	public static void main(String[] args) {
		// 여러 상품의 주문 정보를 담는 배열 생성
		ProductOrder[] orders = new ProductOrder[3];

		// 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
		for (int i = 0; i < orders.length; i++) {
			orders[i] = new ProductOrder();
		}

		orders[0].productName = "두부";
		orders[0].price = 2000;
		orders[0].quantity = 2;

		orders[1].productName = "김치";
		orders[1].price = 5000;
		orders[1].quantity = 1;

		orders[2].productName = "콜라";
		orders[2].price = 1500;
		orders[2].quantity = 2;

		// 상품 주문 정보와 최종 금액 출력
		int sum = 0; // 최종 금액
		for (ProductOrder o : orders) {
			System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
			sum += o.price * o.quantity;
		}
		System.out.println("총 결제 금액: " + sum);

	}

}
