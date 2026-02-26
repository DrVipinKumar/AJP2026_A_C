package lambda;

@FunctionalInterface
interface Calc {
	int square(int n1);
}

public class MainLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc sum=(n1)-> {
			System.out.print("Square=");
			System.out.println((n1*n1));
			return 0;
		};
		sum.square(22);
		Calc sum1=n1-> (n1*n1);
		
		System.out.println(sum1.square(23));

	}

}
