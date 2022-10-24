package file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee emp = new Employee(100, "이진후", 1000000, "개발부");
		
		FileOutputStream fos = null;
		
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("src/file/employee.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("파일작성성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
