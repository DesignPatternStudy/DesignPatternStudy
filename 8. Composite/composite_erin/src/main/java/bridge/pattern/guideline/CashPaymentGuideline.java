package bridge.pattern.guideline;

/**
 * ConcreteImplementor : 실제 기능의 구현
 */
public class CashPaymentGuideline implements PaymentGuideline {
	@Override
	public void discount() {
		System.out.println("현금 DC : 10% 적용");
	}

	@Override
	public void calculate() {
		System.out.println("점원이 계산하다.");
	}
}
