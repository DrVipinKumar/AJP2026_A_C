package poly;

class Animal {
	static String name;
	static String sound;
	Animal(){
		this("Cat1","");
	}
	Animal(String name, String sound){
		this.name=name;
		this.sound=sound;
	}
	
	static void getInfo() {
		System.out.println("Name="+name);
		System.out.println("Sound="+sound);
	}
	void getInfo(String name,String sound,int legs) {
		System.out.println("Name="+name);
		System.out.println("Sound="+sound);
		System.out.println("No of Legs="+legs);
	}
	
}
class Cat extends Animal {
	Cat(String name, String sound){
		super(name,sound);
	}

	static void getInfo() {
		System.out.println("Cat Name="+name);
		System.out.println("Cat Sound="+sound);
	}
//	void getInfo(String name,String sound) {
//		System.out.println("Name="+name);
//		System.out.println("Sound="+sound);
//	}
}
public class PolyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//           Animal an1=new Animal("Horse","HInggg");
//           an1.getInfo();
//           an1.getInfo("Cat", "Meow", 4);  
		Cat c1= new Cat("Cat2","Meow");
        c1.getInfo();
           Animal c2= new Cat("Cat2","Meow");
           c2.getInfo();
	}

}
