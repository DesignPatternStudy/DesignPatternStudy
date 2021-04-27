package composite.raw;

import java.util.ArrayList;
import java.util.Iterator;

import composite.pattern.MenuComponent;

/**
 * Component 와 Composite 의 역할을 모두 한다.
 */
public class Menu {
	ArrayList<Menu> menus = new ArrayList<>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(Menu menuItem) {
		menus.add(menuItem);
	}

	public void remove(Menu menu) {
		menus.remove(menu);
	}

	public Menu getChild(int i) {
		return menus.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println("=="+ getName()+"("+getDescription()+")==");
		System.out.println("--------------");
		Iterator<Menu> iterator = menus.iterator();
		while (iterator.hasNext()) {
			Menu menu = iterator.next();
			menu.print();
		}
	}
}
