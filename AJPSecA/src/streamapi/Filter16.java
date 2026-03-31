package streamapi;

import java.util.ArrayList;

class Student {
	private int sid;
	private String name;
	private int marks;
	public Student(int sid, String name, int marks) {
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
        list.add(new Student(1,"Student 1", 65));
        list.add(new Student(2,"Student 2", 55));
        list.add(new Student(3,"Student 3", 70));
        list.add(new Student(4,"Student 4", 45));
        list.add(new Student(5,"Student 5", 90));
        list.add(new Student(6,"Student 6", 50));
        System.out.println("\tSid\t\tName\t\t\tMarks");
        list.stream()
        .filter(student->student.getMarks()>60)        
        .forEach((student)->{
        String result=	String.format("\t%d\t\t%s\t\t%d", 
        			student.getSid(),student.getName(),student.getMarks());
        	 System.out.println(result);        	  
        });
	}

}
