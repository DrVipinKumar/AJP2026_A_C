package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> marks=Arrays.asList("A", "B", "C");
	       ArrayList<String> list =new ArrayList<String>();
	       list.addAll(marks);
	       System.out.println(list);
	       List<String> grace5=list.stream().map(name->"Item-"+name).toList();
	       System.out.println(grace5);
	}

}
