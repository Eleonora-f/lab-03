package pcd.lab03.ex01_synchwithsem;

import java.util.concurrent.Semaphore;

public class Ponger extends ActiveComponent {

	private Semaphore pingDone;
	private Semaphore pongDone;

	public Ponger(Semaphore pingDone, Semaphore pongDone) {
		this.pingDone = pingDone;
		this.pongDone = pongDone;
	}	
	
	public void run() {
		while (true) {
			try {
				pongDone.acquire();
				println("pong");
				pingDone.release();
			} catch (InterruptedException ex) {
				println("interrupted..");
			}
		}
	}
}