package foreachp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainForeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[]=new int[] {12,34,5,66,78,45};
		List<Integer> listData= Arrays.stream(data).boxed()
				                              .collect(Collectors.toList());
		//listData.forEach((item)-> System.out.println(item));
		listData.forEach(System.out::println);
		

	}

}
