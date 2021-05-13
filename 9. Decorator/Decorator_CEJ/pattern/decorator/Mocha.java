package decorator.pattern.decorator;

import decorator.pattern.Beverage;

/**
 * ConcreteDecorator
 */
public class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage) {
		description = "모카";
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 300 + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() +", "+description;
	}
}
