package cocurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicIntegerBiCounter {

	private AtomicInteger i;

	private AtomicInteger j;
	Lock lockForI = new ReentrantLock();
	Lock lockForj = new ReentrantLock();

	public void incrementi() {
		i.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public void incrementj() {
		j.incrementAndGet();
	}

	public int getj() {
		return j.get();
	}
}
