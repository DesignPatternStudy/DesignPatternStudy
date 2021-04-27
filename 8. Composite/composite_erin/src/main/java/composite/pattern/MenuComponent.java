package composite.pattern;

/**
 * Component : Client 가 사용할 객체
 */
public abstract class MenuComponent {

	/* 투명성을 위해 child 관리 메소드도 포함한다. */
	public void add(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent){
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i){
		throw new UnsupportedOperationException();
	}

	public String getName (){
		throw new UnsupportedOperationException();
	}
	public String getDescription (){
		throw new UnsupportedOperationException();
	}
	public double getPrice (){
		throw new UnsupportedOperationException();
	}

	public boolean isVegetarian (){
		throw new UnsupportedOperationException();
	}
	/* operation 에 해당한다. */
	public void print (){
		throw new UnsupportedOperationException();
	}
}
