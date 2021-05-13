package facade.pattern;

/**
 * 외부의 User 는 쉽게 내부 인터페이스를 사용 할 수 있다.
 */
public class User {
	public static void main(String[] args) {
		MovieFacade movieFacade = new MovieFacade();

		movieFacade.prepareWatchMovie();
		movieFacade.watchMovie();
		movieFacade.endMovie();
	}
}
