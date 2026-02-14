package area2;

interface Area {
	double PI=3.14;
	void getArea();
}

class Rectangle implements Area {
	int l, b;
	Rectangle(int l, int b){
		this.l=l;
		this.b=b;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		int r=l*b;
		System.out.println("Area of Rectangle is ="+r);
		
	}
	void displayResult() {
		System.out.println("This is display function in rectangle");
	}
	
}
public class MainArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Rectangle r1=new Rectangle(24,26);
          r1.getArea();
          r1.displayResult();
          Area r2=new Rectangle(34,56);
          r2.getArea();
          
          Area circle =new Area() {
             int r=4;
			@Override
			public void getArea() {
				// TODO Auto-generated method stub
				double result=3.14*r*r;
				System.out.println("Area of Circle="+result);
			}       };
			circle.getArea();
	}	
}
