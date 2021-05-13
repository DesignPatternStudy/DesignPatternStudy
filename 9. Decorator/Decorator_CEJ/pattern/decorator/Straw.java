package decorator.pattern.decorator;

import decorator.pattern.Beverage;
/**
 * ConcreteDecorator
 */
public class Straw extends CondimentDecorator{
	Beverage beverage;

	public Straw(Beverage beverage) {
		description = "빨대";
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 100 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +", "+description;
	}
}
