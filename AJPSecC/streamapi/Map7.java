package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Employee {
	int eid;
	String name;
	String dpt;
	public Employee(int eid, String name, String dpt) {
		super();
		this.eid = eid;
		this.name = name;
		this.dpt = dpt;
	}
	
}
class EmployeeDTO {
	String name;
	public EmployeeDTO(String name) {
		super();
		this.name = name;	
	}
	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + "]";
	}
	
}
public class Map7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<Employee> list =new ArrayList<Employee>();
	       list.add(new Employee(1,"Ankit","CSE"));
	       list.add(new Employee(2,"Rahul","MCA"));
	       System.out.println(list);
	       List<EmployeeDTO> empName=list.stream()
	    		   .map(emp->new EmployeeDTO(emp.name))
	    		   .toList();
	       System.out.println(empName);
	}

}
