package facade.pattern;

/**
 * 파서드에서 고수준의 인터페이스를 제공한다.
 */
public class MovieFacade {
	private BeverageService beverageService;
	private MovieService movieService;

	public MovieFacade() {
		beverageService = new BeverageService();
		movieService = new MovieService();
	}

	public void prepareWatchMovie(){
		System.out.println("--- 영화 볼 준비를 합니다. ---");
		beverageService.prepare();
		beverageService.serve();
		movieService.prepare();
	}
	public void watchMovie(){
		System.out.println("--- 영화를 봅니다. ---");
		movieService.turnOn();
	}
	public void endMovie(){
		System.out.println("--- 영화가 끝났습니다. ---");
		movieService.turnOff();
		beverageService.throwTrash();
	}
}
