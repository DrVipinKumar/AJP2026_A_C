package java8;

interface Message {
	void displayMsg();
	default void displayMsg(String msg) {
		msgInfo(msg);
	}
	static void displayInfo() {
		System.out.println("This is display Info");
	}
	private void msgInfo(String msg) {
		System.out.println(msg);
	}
}
class DisplayMessage implements Message {

	@Override
	public void displayMsg() {
		// TODO Auto-generated method stub
		System.out.println("This is main display method");
	}
	@Override
	public void displayMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Message by DM class="+msg);
	}
	
}
public class MainInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          DisplayMessage dm=new DisplayMessage();
          dm.displayMsg();
          dm.displayMsg("This is second method");
          Message.displayInfo();
	}

}
