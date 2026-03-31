package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> data=Arrays.asList("Java", null, "Spring", null, "React");
	        ArrayList<String> list =new ArrayList<String>();
	        list.addAll(data);
	       List<String> notNullList= list.stream()
	        .filter(lang->lang!=null)
	        .toList();
	       System.out.println(notNullList);
	}

}
