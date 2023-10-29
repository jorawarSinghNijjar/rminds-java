package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadPooling {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 10; i++) {
			Runnable r = new ThreadPooling("Task " + i);
			
			service.execute(r);
		}
		
		service.shutdown();
	}

}
