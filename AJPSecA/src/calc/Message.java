package calc;
class DisplayMessage {
	String msg;
	 
	 DisplayMessage(String msg){
		 this.msg=msg;
	 }
	 DisplayMessage(){
		  this("This is Java 8+");
		  System.out.println("This is constructor");
	 }
	 void displayInfo() {
		 System.out.println(msg);
	 }
}

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DisplayMessage dm=new DisplayMessage();
           dm.displayInfo();
           DisplayMessage dm1=new DisplayMessage("This is user defined constructor");
           dm1.displayInfo();
	}

}
