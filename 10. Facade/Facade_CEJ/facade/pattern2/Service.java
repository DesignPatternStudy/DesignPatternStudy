package facade.pattern2;

import facade.pattern2.thirdparty.Database;
import facade.pattern2.thirdparty.FindDomain;

/**
 * User 가 접근하는 Facade 이다.
 * Database 에 접근하는 부분만 변경 해주면 된다.
 */
public class Service {
	private final Database database;

	public Service() {
		this.database = new Database();
	}

	public void getData(final String table, final String primaryKey){
		database.find(table, primaryKey);
	}

	public void changedGetData(final String table, final String primaryKey){
		database.changedFind(new FindDomain(table, primaryKey));
	}
}
