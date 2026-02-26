package java8;

class VoterList {
	void checkVoterName(int ageValue){
	      if(ageValue>18) {
	    	  System.out.println("You can vote!");
	      } else {
	    	  System.out.println("You can not vote!");
	      }
}
}
@FunctionalInterface
interface Voter {
	void checkVoter(int age);
}
public class VoterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Voter v = age -> {
        	      if(age>18) {
        	    	  System.out.println("You can vote!");
        	      } else {
        	    	  System.out.println("You can not vote!");
        	      }
         };
         v.checkVoter(20);
         VoterList vl =new VoterList();
         Voter v1 =vl::checkVoterName;
         v1.checkVoter(17);
	}
}

