package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=Arrays.asList("Java", "Pythons" ,"JavaScript");
	       ArrayList<String> list =new ArrayList<String>();
	       list.addAll(names);
	       System.out.println(list);
	       List<Integer> hashList=list.stream().map(lang->lang.hashCode()).toList();
	       System.out.println(hashList);
	}

}
