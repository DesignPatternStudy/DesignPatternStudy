package bridge.pattern.payment;

import bridge.pattern.guideline.PaymentGuideline;

/**
 * RefinedAbstraction : Abstraction의 정의를 확장
 */
public class Card extends Payment {
	public Card(PaymentGuideline paymentGuideline) {
		super(paymentGuideline);
	}

	@Override
	public void pay() {
		System.out.println("카드 결제");
	}
}
