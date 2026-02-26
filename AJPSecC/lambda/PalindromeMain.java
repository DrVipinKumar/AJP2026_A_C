package lambda;

import java.util.ArrayList;
import java.util.HashMap;

@FunctionalInterface
interface PString {
	boolean checkPalin(String info);
}

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list = new ArrayList<>();
		var map = new HashMap<Integer,String>();
		var number = 20;

		
		
             PString ps=(String info)->{
            	   return new StringBuilder(info).reverse().toString().equals(info);        	  
             };
             if(ps.checkPalin("AcA"))
             {
            	 System.out.println("Palindrome");
             } else {
            	 System.out.println("Not Palindrome");
             }
	}

}
