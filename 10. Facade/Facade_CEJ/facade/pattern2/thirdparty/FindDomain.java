package facade.pattern2.thirdparty;

public class FindDomain {
	private String table;
	private String primaryKey;

	public FindDomain(String table, String primaryKey) {
		this.table = table;
		this.primaryKey = primaryKey;
	}

	public String getTable() {
		return table;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}
}
