package ro.ase.pmj.models;

import java.util.concurrent.Callable;

public class SumArrayThreadCallable implements Callable<Long>{
	
	int[] arr;
	long sum;
	int indexStart;
	int indexStop;
	
	public SumArrayThreadCallable(int[] arr, int indexStart, int indexStop) {
		super();
		this.arr = arr;
		this.indexStart = indexStart;
		this.indexStop = indexStop;
	}
	
	public long getSum() {
		return sum;
	}

	@Override
	public Long call() throws Exception {
		this.sum = 0;
		
		for(int i=indexStart;i<indexStop; i++) {
			this.sum += arr[i];
		}
		
		return sum;
	}


//	@Override
//	public void run() {
//		
//		super.run();
//		
//		this.sum = 0;
//		
//		for(int i=indexStart;i<indexStop; i++) {
//			this.sum += arr[i];
//		}
//	}
	
	
	
	
	

}
