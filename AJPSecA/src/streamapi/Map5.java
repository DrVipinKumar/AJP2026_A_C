package streamapi;

import java.util.Arrays;
import java.util.List;

public class Map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> values=Arrays.asList("A", "B", "C");
	       System.out.println(values);
	       List<String> result=values.stream()
	    		   .map(item->"Item-"+item)
	    		   .toList();
	       System.out.println(result);
	}

}
