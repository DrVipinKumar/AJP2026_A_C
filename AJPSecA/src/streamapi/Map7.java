package streamapi;

import java.util.ArrayList;
import java.util.List;

class Employee {
	 int eid;
	 String name;
	 String dept;
	 public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	 }
	 
}
public class Map7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Employee> list=new ArrayList<Employee>();
       list.add(new Employee(1,"Ankit","MCA"));
       list.add(new Employee(2,"Rahul","CSE"));
       List<String> empNames=list
    		   .stream()
    		   .map(emp->emp.name)
    		   .toList();
       System.out.println(empNames);
	}

}
