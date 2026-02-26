package funinter;

@FunctionalInterface
interface Sub {
	int subtract(int n1, int n2);
}

public class MainFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Sub s =new Sub() {
			@Override
			public int subtract(int n1, int n2) {
				// TODO Auto-generated method stub
				return n1-n2;
			}};
			int r=s.subtract(100, 30);
			System.out.println("Subtraction="+r);
			Sub s1= (int n1, int n2)-> n1-n2; //Lambda Expression
			int r1=s1.subtract(100, 30);
			System.out.println("Subtraction="+r1);
	}
	}      