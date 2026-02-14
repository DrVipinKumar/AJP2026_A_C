package area;

class Area {
	int r, l, b;
	Area(String msg){
		System.out.println(msg);
	}
	void getArea() {};
}
class Circle extends Area {
	final double PI=3.14;
	Circle(int r){
		super("This is area constructor");
		this.r=r;
	}
	void getCircleArea() {
		double result= PI * super.r * this.r;
		System.out.println("Area of Circle="+result);
	}
}

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Area a;
		       
                Circle c =new Circle(12);
                c.getArea();
                c.getCircleArea();
//                Area a =new Circle(34);
//                a.getArea();               
               
                
	}

}
