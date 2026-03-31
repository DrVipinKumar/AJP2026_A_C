package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(1, 2, 3, 4);
	       ArrayList<Integer> list =new ArrayList<Integer>();
	       list.addAll(numbers);
	       System.out.println(list);
	       List<Integer> evenBool=list.stream().map(num->num%2==0?1:0).toList();
	       System.out.println(evenBool);
	}

}
