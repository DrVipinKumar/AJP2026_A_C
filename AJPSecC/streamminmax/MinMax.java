package streamminmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(23,12,6,67,89,43);
		Optional<Integer> result=list.stream().min((a,b)->a-b);
        result.ifPresent(System.out::println);
	}

}
