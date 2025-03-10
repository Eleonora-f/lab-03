package pcd.lab03.ex01_synchwithsem;

import java.util.concurrent.Semaphore;

public abstract class ActiveComponent extends Thread {

	protected Semaphore s;

	protected void print(String msg){
		synchronized (System.out){
			System.out.print(msg);
		}
	}

	protected void println(String msg){
		synchronized (System.out){
			System.out.println(msg);
		}
	}

}
