package bridge.raw;

public abstract class Payment {

	public abstract void pay();
	// 기본 기능에 새로운 구현이 추가 될 경우, 영향 가능성 있음
	public abstract void calculate();
	public abstract void discount();

}
