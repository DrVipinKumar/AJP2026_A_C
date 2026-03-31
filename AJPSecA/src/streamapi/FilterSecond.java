package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> data=Arrays.asList("Amit", "Ravi", "Anil", "Vikas","Ashok", "Rahul");
        ArrayList<String> list =new ArrayList<String>();
        list.addAll(data);
        list.stream()
        .filter(name->name.startsWith("A"))
        .forEach(System.out::println);;
	}

}
