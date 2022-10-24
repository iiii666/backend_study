package file;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee implements Serializable{
	private int no;
	private String name;
	private int salary;
	private String dname;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return no + "\t" + name + "\t" + salary + "\t" + dname;
	}
	public Employee(int no, String name, int salary, String dname) {
		super();
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.dname = dname;
	}
}
