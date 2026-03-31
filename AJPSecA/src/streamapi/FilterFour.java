package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> data=Arrays.asList("Java", "Python", "C", "React", "C#", "Next.js", "Node.js");
	        ArrayList<String> list =new ArrayList<String>();
	        list.addAll(data);
	        list.stream()
	        .filter(lang->lang.length()>4)
	        .forEach(System.out::println);
	}

}
