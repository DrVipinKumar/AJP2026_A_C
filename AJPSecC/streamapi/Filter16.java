package streamapi;

import java.util.ArrayList;
import java.util.List;

class Student {
	private int sid;
	private String name;
	private int marks;
	Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
public class Filter16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       ArrayList<Student> list =new ArrayList<Student>();
       list.add(new Student(1,"Student 1",60));
       list.add(new Student(2,"Student 2",40));
       list.add(new Student(3,"Student 3",45));
       list.add(new Student(4,"Student 4",75));
       list.add(new Student(1,"Student 5",90));
       List<Student> g60=list.stream()
    		   .filter(student->student.getMarks()>60)
    		   .toList();
       g60.stream().forEach(System.out::println);
       ;
       
	}

}
