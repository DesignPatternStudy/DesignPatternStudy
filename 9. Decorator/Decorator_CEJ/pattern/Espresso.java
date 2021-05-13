package decorator.pattern;

/**
 * ConcreteComponent
 */
public class Espresso extends Beverage{
	public Espresso() {
		description = "에스프레소";
	}

	@Override
	public double cost() {
		return 3000;
	}
}
