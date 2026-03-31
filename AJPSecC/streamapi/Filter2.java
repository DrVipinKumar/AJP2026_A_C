package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> names=Arrays.asList("Amit", "Ravi", "Anil", "Vikas", "Ashok", "Rahul");
	       ArrayList<String> list =new ArrayList<String>();
	       list.addAll(names);
	       List<String> listA=list.stream()
	    		   .filter(name->name.startsWith("A"))
	    		   .toList();
	       System.out.println(listA);
	}

}
