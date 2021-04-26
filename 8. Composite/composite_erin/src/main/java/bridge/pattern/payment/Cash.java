package bridge.pattern.payment;

import bridge.pattern.guideline.PaymentGuideline;

/**
 * RefinedAbstraction : Abstraction의 정의를 확장
 */
public class Cash extends Payment {
	public Cash(PaymentGuideline paymentGuideline) {
		super(paymentGuideline);
	}

	@Override
	public void pay() {
		System.out.println("현금 결제");
	}
}
