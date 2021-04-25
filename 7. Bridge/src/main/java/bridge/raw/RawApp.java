package bridge.raw;


public class RawApp {
	public static void main(String[] args) {
		Payment card = new Card();
		Payment cash = new Cash();

		card.discount();
		card.calculate();
		card.pay();

		System.out.println();

		cash.discount();
		cash.calculate();
		cash.pay();
	}
}
