package bridge.pattern.guideline;

/**
 * Implementor : 구현 클래스를 위한 인터페이스 정의.
 * Abstraction(기능부)의 기능을 구현하기 위함
 */
public interface PaymentGuideline {
	void calculate();
	void discount();
}
