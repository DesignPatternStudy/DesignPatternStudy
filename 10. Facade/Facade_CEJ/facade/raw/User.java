package facade.raw;

public class User {
	public static void main(String[] args) {
		BeverageService beverageService = new BeverageService();
		MovieService movieService = new MovieService();
		System.out.println("--- 영화 볼 준비를 합니다. ---");
		beverageService.prepare();
		beverageService.serve();
		movieService.prepare();
		System.out.println("--- 영화를 봅니다. ---");
		movieService.turnOn();
		System.out.println("--- 영화가 끝났습니다. ---");
		movieService.turnOff();
		beverageService.throwTrash();
	}
}
