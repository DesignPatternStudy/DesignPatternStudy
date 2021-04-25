package bridge.pattern;

import bridge.pattern.guideline.CardPaymentGuideline;
import bridge.pattern.guideline.CashPaymentGuideline;
import bridge.pattern.payment.Card;
import bridge.pattern.payment.Cash;
import bridge.pattern.payment.Payment;

public class PatternApp {
	public static void main(String[] args) {
		Payment card = new Card(new CardPaymentGuideline());
		Payment cash = new Cash(new CashPaymentGuideline());

		card.discount();
		card.calculate();
		card.pay();

		System.out.println();

		cash.discount();
		cash.calculate();
		cash.pay();
	}
}
