package composite.raw;


public class Waitress {
	Menu menu;

	public Waitress(Menu menus) {
		this.menu = menus;
	}

	public Menu getMenu() {
		return menu;
	}

	public void printMenu(){
		menu.print();
	}
}
