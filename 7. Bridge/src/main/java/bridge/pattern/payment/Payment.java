package bridge.pattern.payment;

import bridge.pattern.guideline.PaymentGuideline;

/**
 * Abstraction : 기능 계층의 최상위 클래스
 *  implementor(구현부) 에 대한 레퍼런스를 유지
 *  구현부를 모두 위임 하여 브릿지 패턴의 특성을 나태낸다.
 */
public abstract class Payment {

	/* 구현부의 클래스를 인스턴스로 가진다. */
	private PaymentGuideline paymentGuideline;

	protected Payment(PaymentGuideline paymentGuideline) {
		this.paymentGuideline = paymentGuideline;
	}

	public abstract void pay();
	/* 구현부의 메소드를 호출한다. */
	public void calculate(){
		paymentGuideline.calculate();;
	}
	public void discount(){
		paymentGuideline.discount();
	}

}
