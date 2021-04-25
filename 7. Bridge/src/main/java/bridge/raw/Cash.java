package bridge.raw;

public class Cash extends Payment{
	@Override
	public void pay() {
		System.out.println("현금 결제");
	}

	@Override
	public void calculate() {
		System.out.println("점원이 계산하다.");
	}

	@Override
	public void discount() {
		System.out.println("현금 DC : 10% 적용");
	}
}
