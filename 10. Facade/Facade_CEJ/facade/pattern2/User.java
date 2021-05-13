package facade.pattern2;

/**
 * 지금은 하나의 User 라고 가정.
 * 만약, 3rdParty Database 에 접근하는 많은 User 가 있다고 가정헀을 때,
 * 모든 유저 코드에서 (table, parimaryKey)로 접근 하는 것을 찾아
 * (FindDomain) 으로 접근하도록 바꾸어주어야 한다.
 */
public class User {
	public static void main(String[] args) {
		Service service = new Service();

		service.getData("음식","100");

	}
}
