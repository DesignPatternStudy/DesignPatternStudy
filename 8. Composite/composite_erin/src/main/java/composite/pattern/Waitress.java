package composite.pattern;

/**
 * Client : Component 를 사용한다.
 */
public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}

	public void printMenu(){
		allMenus.print();
	}
}
