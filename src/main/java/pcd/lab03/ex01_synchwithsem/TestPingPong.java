package pcd.lab03.ex01_synchwithsem;

import java.util.concurrent.Semaphore;

/**
 * Unsynchronized version
 * 
 * @TODO make it sync 
 * @author aricci
 *
 */
public class TestPingPong {
	public static void main(String[] args) {
		Semaphore pingDone = new Semaphore(0);
		Semaphore pongDone = new Semaphore(0);

		new Pinger(pingDone, pongDone).start();
		new Ponger(pingDone, pongDone).start();

		pongDone.release();
	}

}
