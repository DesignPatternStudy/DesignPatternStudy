package facade.pattern;

public class BeverageService {
	public void prepare(){
		System.out.println("음료를 준비하다.");
	}
	public void serve(){
		System.out.println("음료를 제공하다.");
	}
	public void throwTrash(){
		System.out.println("쓰레기를 버리다.");
	}
}
