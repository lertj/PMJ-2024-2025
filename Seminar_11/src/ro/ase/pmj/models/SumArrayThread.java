package ro.ase.pmj.models;

public class SumArrayThread extends Thread{
	
	int[] arr;
	long sum;
	int indexStart;
	int indexStop;
	
	public SumArrayThread(int[] arr, int indexStart, int indexStop) {
		super();
		this.arr = arr;
		this.indexStart = indexStart;
		this.indexStop = indexStop;
	}
	
	public long getSum() {
		return sum;
	}

	@Override
	public void run() {
		
		super.run();
		
		this.sum = 0;
		
		for(int i=indexStart;i<indexStop; i++) {
			this.sum += arr[i];
		}
	}
	
	
	
	
	

}
