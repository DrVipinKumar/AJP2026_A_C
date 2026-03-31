package streamsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Employee {
	int eid;
	String name;
	String dept;
	int salary;
	public Employee(int eid, String name,String dept, int salary) {
		super();
		this.eid = eid;
		this.name=name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Employee> list =new ArrayList<Employee>();	
      list.add(new Employee(1,"Rahul","IT",20000));
      list.add(new Employee(4,"Rahul","Admin",40000));
      list.add(new Employee(3,"Rahul","Marketing",20000));
      list.add(new Employee(2,"Rahul","Sales",60000));
      list.add(new Employee(5,"Rahul","IT",10000));
      List<Employee> sortedList=list.stream()
    		   .sorted((e1,e2)->e2.salary-e1.salary)
    		   .toList();
      sortedList.forEach(System.out::println);
	}
}
