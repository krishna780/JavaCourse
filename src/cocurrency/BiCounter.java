package cocurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounter {

	private int i = 0;

	private int j = 0;
	Lock lockForI = new ReentrantLock();
	Lock lockForj = new ReentrantLock();

	 public void incrementi() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}

	 public void incrementj() {
		j++;
	}

	public int getj() {
		return j;
	}
}
