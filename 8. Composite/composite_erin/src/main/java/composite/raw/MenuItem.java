package composite.raw;

public class MenuItem extends Menu {
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super(name, description);
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	@Override
	public void print() {
		System.out.println("item name : "+getName());
		if(isVegetarian()) System.out.println("(vegetarian)");
		System.out.println("item price : "+getPrice());
		System.out.println("item description : "+getDescription());
	}

}
