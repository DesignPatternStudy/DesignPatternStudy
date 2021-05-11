package decorator.pattern.decorator;

import decorator.pattern.Beverage;

/**
 * Decorator :
 * 상속을 통해 Component 와 같은 인터페이스를 가진다.
 * 투과적 인터페이스 : Decorator 로 계속 감싸도 Component 의 메소드는 계속 사용 가능
 */
public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
