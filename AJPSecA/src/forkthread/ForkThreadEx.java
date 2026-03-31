package forkthread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Task extends RecursiveTask<Integer>{
   int start, end;
   	 Task(int start, int end){
		 this.start=start;
		 this.end=end;
	 }
	@Override
	protected Integer compute() {
		// TODO Auto-generated method stub

		if((end-start)<=3){
			int sum=0;
			for(int i=start;i<end;i++) {
				sum=sum+i;
			}
			return sum;
		}
		int  mid=(end+start)/2;
		Task left =new Task(start, mid);
		Task right =new Task(mid+1,end);
		left.fork();
		return right.compute()+left.join();
	}
	
}

public class ForkThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ForkJoinPool pool =new ForkJoinPool();
       int result =pool.invoke(new Task(1,20));
       System.out.println(result);
	}

}
