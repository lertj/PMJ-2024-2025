package ro.ase.pmj.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().maxMemory()); 
		
		int noElements = 500_000_000;
		
		int[] arr = new int[noElements];
		
		for(int i=0;i<noElements;i++) {
			arr[i] = i+1;
		}
		
		long startTime = System.currentTimeMillis();
		
		
		
		long suma = 0;
		
		for(int i=0;i<noElements; i++) {
			suma+=arr[i];
		}
		
		long finishTime = System.currentTimeMillis();
		
		System.out.println("Duration:" + (finishTime - startTime) + "ms" );
		System.out.println("Sum: " + suma);
		
		startTime = System.currentTimeMillis();
		
		int noThreads = 5;
		SumArrayThread[] vSumArr = new SumArrayThread[noThreads];
		
		// 5 Threads ipotetic
		for(int i=0;i<noThreads;i++) {
			vSumArr[i] = new SumArrayThread(arr, noElements/noThreads*i, noElements/noThreads*(i+1));
			//vSumArr[i].start();
		}
		
		for(int i=0;i<noThreads;i++) {
			vSumArr[i].start();
		}
		
		suma = 0;
		
		for(int i=0;i<noThreads;i++) {
			try {
				vSumArr[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			suma+=vSumArr[i].getSum();
		}
		
		
		finishTime = System.currentTimeMillis();
		System.out.println("Duration:" + (finishTime - startTime) + "ms" );
		System.out.println("Sum: " + suma);
		
		// ********************* CALLABLE *************************
		
		ExecutorService threadPool = Executors.newFixedThreadPool(noThreads);
		
		startTime = System.currentTimeMillis();
		
		SumArrayThreadCallable[] vSumCall = new SumArrayThreadCallable[noThreads];
		
		// 5 Threads ipotetic
		for(int i=0;i<noThreads;i++) {
			vSumCall[i] = new SumArrayThreadCallable(arr, noElements/noThreads*i, noElements/noThreads*(i+1));
			//vSumArr[i].start();
		}
		suma = 0;
		
		
		List<Future> listF = new ArrayList<>();
		
		for(int i=0;i<noThreads;i++) {
			try {
				listF.add(threadPool.submit(vSumCall[i]));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		threadPool.shutdown();
		try {
			threadPool.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for(Future<Long> f : listF) {
			try {
				suma += f.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		finishTime = System.currentTimeMillis();
		System.out.println("Duration:" + (finishTime - startTime) + "ms" );
		System.out.println("Sum: " + suma);
		
		
	}

}
