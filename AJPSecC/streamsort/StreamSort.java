package streamsort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =Arrays.asList("Suresh", "Amit", "Neha", "Vikas", "Priya");
		System.out.println(list);
		List<String>sortedList=list.stream()
				.sorted((a,b)->b.compareTo(a))
				.toList();
		System.out.println(sortedList);
	}

}
