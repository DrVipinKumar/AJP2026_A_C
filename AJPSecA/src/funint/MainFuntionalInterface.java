package funint;

@FunctionalInterface
interface Calc{
	String square (int n1);	
}

public class MainFuntionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Calc a1 =num-> "Square of number is ="+(num*num);
          
        	   //Lambda Expression
          String result= a1.square(20);
          System.out.println(result);
	}

}
