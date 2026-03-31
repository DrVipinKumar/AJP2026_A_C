package streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=IntStream.rangeClosed(1, n).reduce(1, (a,b)->a*b);
		System.out.println(fact);
		
//		int value=123456;
//		int rel=String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
//		System.out.println(rel);
		
//      List<Integer> list= Arrays.asList(12, 34, 56, 77);
//      int res=list.stream().reduce(0,(a, b)-> a + (2) + (b-(b%10))/10);
//      //System.out.println(finalList);
//      System.out.println(res);


	}

}
