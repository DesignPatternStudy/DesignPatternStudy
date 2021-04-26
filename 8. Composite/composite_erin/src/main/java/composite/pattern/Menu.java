package composite.pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite : 복합계층의 관리역할 + 기능을 관리한다.
 * 따라서, 하나의 객체가 하나의 기능 꾸러미가 아니다.
 */
public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<>();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	@Override
	public MenuComponent getChild(int i) {
		return menuComponents.get(i);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void print() {
		System.out.println("=="+ getName()+"("+getDescription()+")==");
		System.out.println("--------------");
		/* operation 을 위임한다 */
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}
}
