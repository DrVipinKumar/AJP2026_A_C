package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> data= Arrays.asList(23,45,12,56,78,90,25,65,87);
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(data);
        System.out.println(list);
        List<Integer> g50=list.stream().filter(n->n>50).collect(Collectors.toList());
        list.stream().filter(n->n>50 && n<70).forEach((value)->System.out.print(value+" "));
        System.out.println();
        System.out.println(g50);	
	}
}
