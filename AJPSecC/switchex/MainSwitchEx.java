package switchex;
import edu.kiet.classc.Message;

public class MainSwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message m =new Message();
		m.getMessage();
		int day=1;
		String result=switch(day) {
		case 1,7 -> {
			System.out.println("this is 1,& 7 case");
			yield "Monday";
			}
		case 2,3,4-> "Tuesday";
		default-> "No Day";
		};
		System.out.println(result);

	}

}
