package str;

public class StringTest2 {
	public static void main(String[] args) {
		
		StringBuilder sql = new StringBuilder();
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());
		sql.append("select last");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());
		sql.append("dsa");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());

		sql.append("ASDffffffff");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());

	}
}
