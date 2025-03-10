package pcd.lab03.ex01_synchwithsem;

import java.util.concurrent.Semaphore;

public class Pinger extends ActiveComponent {

	private Semaphore pingDone;
	private Semaphore pongDone;

	public Pinger(Semaphore pingDone, Semaphore pongDone) {
		this.pingDone = pingDone;
		this.pongDone = pongDone;
	}	
	
	public void run() {
		while (true) {
			try {
				pingDone.acquire();
				println("ping");
				pongDone.release();
			} catch (InterruptedException ex) {
				println("interrupted..");
			}
		}
	}
}