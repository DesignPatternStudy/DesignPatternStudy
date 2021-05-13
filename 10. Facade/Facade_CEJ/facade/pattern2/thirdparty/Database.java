package facade.pattern2.thirdparty;

/**
 * 외부의 Database에 접근하는 3rdParty API라고 가정한다.
 * 초기 제공 메소드는 find 였다가, changeFind로 바뀌었다고 가정한다.
 */
public class Database {
	public void find(final String table, final String primaryKey){
		System.out.println(table+"의 "+primaryKey+"데이터를 가져오다.");
	}
	public void changedFind(FindDomain findDomain){
		System.out.println(findDomain.getTable()+"의 "+findDomain.getPrimaryKey()+"데이터를 가져오다.");
	}
}
