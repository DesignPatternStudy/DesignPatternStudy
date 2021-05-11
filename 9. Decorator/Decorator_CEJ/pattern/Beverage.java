package decorator.pattern;

/**
 * Component :
 * 되도록 가볍게 가능한 인터페이스만을 정의하며,
 * 상속받는 여러 Decorator 가 무거워 지지 않도록 변수는 정의하지 않는다.
 * 저장 할 것이 있다면 Subclass 에서 한다.
 */
public abstract class Beverage {
	protected String description = "제목 없음";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	@Override
	public String toString() {
		return getDescription() + "의 가격은 : "+cost();
	}
}
