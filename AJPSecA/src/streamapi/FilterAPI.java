package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> data=Arrays.asList(24,56,23,45,67);
		 System.out.println(data);
         ArrayList<Integer> list= new ArrayList<Integer>();
         list.add(23);
         list.add(45);
         list.addAll(List.of(23,56,78,23,45,67,85,95,112));
         list.addAll(data);
         System.out.println(list);
         list.stream().filter((n)->n>60).forEach((n)-> System.out.print(n+" "));
         List<Integer> g60=list.stream().filter((n)->n>60 && n<90).toList();
         System.out.println();
         System.out.println(g60);
         
         
     
         
	}

}
