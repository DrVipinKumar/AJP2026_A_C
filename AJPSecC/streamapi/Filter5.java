package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names=Arrays.asList("Java", null, "Spring", null, "React");
	       ArrayList<String> list =new ArrayList<String>();
	       list.addAll(names);
	       List<String> listNotNull=list.stream()
	    		   .filter(name->name!=null)
	    		   .toList();
	       System.out.println(listNotNull);
	}

}
