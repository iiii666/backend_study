package str;

public class StringTest1 {
	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());
		sql.append("select last");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());
		sql.append("dsa");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());

		sql.append("ASDffffffff");
		System.out.println(sql.length() + ":" + sql.capacity() + ":" + sql.toString());

	}
}
