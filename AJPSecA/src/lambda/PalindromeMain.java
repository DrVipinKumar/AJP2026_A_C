package lambda;

@FunctionalInterface
interface CheckPalindrome {
	boolean checkPalin(String info);
}

public class PalindromeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   CheckPalindrome cp=(String info)->new StringBuilder(info).reverse()
		   .toString().equals(info);
        
	}

}
