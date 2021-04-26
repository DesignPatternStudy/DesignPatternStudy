package composite.pattern;

/**
 * Leaf : 계층구조에서 child 역할
 */
public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	@Override
	public String getName(){

		return name;

	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public boolean isVegetarian() {
		return vegetarian;
	}
	@Override
	public void print() {

		System.out.println("item name :"+getName());
		if(isVegetarian()) System.out.println("(vegetarian)");
		System.out.println("item price : "+getPrice());
		System.out.println("item description : "+getDescription());
	}

}
