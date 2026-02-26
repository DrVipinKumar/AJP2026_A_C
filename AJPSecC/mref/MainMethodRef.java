package mref;

class Circle {
	Circle(){
		System.out.println("Constructor in Circle");
	}
	Circle(String msg){
		System.out.println(msg);
	}
	static double area(int r) {
		return Math.PI*r*r;
	}
}
@FunctionalInterface
interface CircleInfo {
	void getInfo(String msg);
}
@FunctionalInterface
interface Area {
	double getArea(int num);
}
public class MainMethodRef {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Circle c = new Circle();
             Area ca= Circle::area;
             System.out.println("Area ="+ca.getArea(34));
             CircleInfo ci=Circle::new;
             ci.getInfo("This is parameterized constructor");
	}

}
