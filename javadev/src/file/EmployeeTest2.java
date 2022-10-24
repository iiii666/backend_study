package file;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class EmployeeTest2 {
	public static void main(String[] args) {
		try(FileInputStream fos= new FileInputStream("src/file/employee.txt");
				ObjectInputStream oos = new ObjectInputStream(fos);	) {
				Employee emp = (Employee) oos.readObject();
				System.out.println("사번    이름      급여    부서");
				System.out.println("------------------------------");
				System.out.println(emp);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
