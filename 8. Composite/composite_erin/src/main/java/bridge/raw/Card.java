package bridge.raw;

public class Card extends Payment{
	@Override
	public void pay() {
		System.out.println("카드 결제");
	}

	@Override
	public void calculate() {
		connectCompany();
		System.out.println("카드사에서 계산하다.");
	}

	@Override
	public void discount() {
		System.out.println("카드는 할인이 없음");
	}

	private void connectCompany(){
		System.out.println("카드사와 연결합니다.");
	}
}
