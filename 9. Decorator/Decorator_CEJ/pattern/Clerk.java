package decorator.pattern;

import decorator.pattern.decorator.Mocha;
import decorator.pattern.decorator.Straw;

public class Clerk {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage);
		beverage = new Mocha(beverage);
		System.out.println(beverage);

		Beverage beverage2 = new HouseBlend();
		System.out.println(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Straw(beverage2);
		System.out.println(beverage2);
	}
}
