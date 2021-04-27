package composite.raw;

/**
 * 결과는 동일하지만, 사용자 입장에서는 복합객체를 사용하는 것이 된다.
 */
public class OrderApp {

	public static void main(String args[]) {

		Menu pancakeHouseMenu = new Menu("펜케이크 하우스 메뉴", "아침 메뉴");

		Menu dinerMenu = new Menu("객체마을 식당 메뉴", "점심 메뉴");

		Menu cafeMenu = new Menu("카페 메뉴", "저녁 메뉴");

		Menu dessertMenu = new Menu("디저트 메뉴", "디저트를 즐겨 보세요");

		Menu allMenus = new Menu("전체 메뉴", "전체 메뉴");

		allMenus.add(pancakeHouseMenu);

		allMenus.add(dinerMenu);

		allMenus.add(cafeMenu);

		dinerMenu.add(new MenuItem("파스타", "마리나라 소스 스파게티.", true, 8000));

		dinerMenu.add(dessertMenu);

		dessertMenu.add(new MenuItem("애플 파이", "바삭바삭한 크러스트에 바닐라아이스크림이", true, 1500));

		allMenus.add(new MenuItem("비밀메뉴", "나만 먹을 수 있는 메뉴", false, 30000));
		Waitress waitress = new Waitress(allMenus);

		waitress.printMenu();

	}

}

