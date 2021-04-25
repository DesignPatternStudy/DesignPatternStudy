package bridge.pattern.guideline;

/**
 * ConcreteImplementor : 실제 기능의 구현
 */
public class CardPaymentGuideline implements PaymentGuideline {
	@Override
	public void discount() {
		System.out.println("카드는 할인이 없음");
	}

	@Override
	public void calculate() {
		connectCompany();
		System.out.println("카드사에서 계산하다.");
	}

	private void connectCompany(){
		System.out.println("카드사와 연결합니다.");

	}
}
