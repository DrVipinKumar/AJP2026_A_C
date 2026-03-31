package streamminmax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class Employee {
    int id;
    String name;
    double salary;
    int age;
    String department;

    public Employee(int id, String name, double salary, int age, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getAge() { return age; }
    public String getDepartment() { return department; }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", department="
				+ department + "]";
	}
    
}


public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>(Arrays.asList(
		        new Employee(101, "Amit", 50000, 25, "IT"),
		        new Employee(102, "Neha", 60000, 28, "HR"),
		        new Employee(103, "Ravi", 45000, 24, "IT"),
		        new Employee(104, "Karan", 70000, 30, "Finance"),
		        new Employee(105, "Pooja", 55000, 27, "HR"),
		        new Employee(106, "Rohit", 80000, 32, "IT"),
		        new Employee(107, "Simran", 65000, 29, "Finance"),
		        new Employee(108, "Amit", 50000, 25, "IT")
		));
	empList.stream()
		.sorted(Comparator.comparing(Employee::getAge))
		.limit(2)
		.forEach(System.out::println);
//	System.out.println(result); 6,24,30,39,41,47,54,59,61
//		empList.stream()
//				.collect(Collectors.toMap(
//						Employee::getName,
//						e->e,
//						(e1,e2)->e1
//						))
//				.values()
//				.forEach(System.out::println);

//		System.out.println(result);

	}

	
}
