package java8;
interface Calc {
	void calculate(int n1, int n2);
	default void calculate(int n1, int n2, int n3) {
		int s=n1+n2+n3;
//		System.out.println("Sum="+s);
		getPrivateInfo("Sum="+s);
	}
	static String getInfo() {
		return "This is static getInfo method inside Calc Interface";
	}
	private void getPrivateInfo(String msg) {
		System.out.println(msg);
	}
}
class Sum implements Calc {

	@Override
	public void calculate(int n1, int n2) {
		// TODO Auto-generated method stub
		int s=n1+n2;
		System.out.println("Sum="+s);
	}
    public void calculate(int n1, int n2, int n3) {
		int s=n1+n2+n3;
		System.out.println("Sum of 3 number="+s);
	}
	
}
public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Sum c =new Sum();
             c.calculate(12, 34);
             c.calculate(23,45,67);
             System.out.println(Calc.getInfo());
             
	}

}
