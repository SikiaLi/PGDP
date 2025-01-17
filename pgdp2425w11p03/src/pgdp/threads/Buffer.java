package pgdp.threads;

import java.util.concurrent.Semaphore;

public class Buffer {
	private Exam[] data;
	private Semaphore free;
	private Semaphore occupied;
	int first = 0, last = 0;

	public Buffer(int maxSize) {
		if (maxSize < 0)
			throw new IllegalArgumentException(
					"Buffer must have positive size!");
		data = new Exam[maxSize];
		// TODO: Vervollständige diesen Konstruktor
		free = new Semaphore(maxSize);
		occupied = new Semaphore(0);
	}

	public Exam consume() throws InterruptedException {
		// TODO: Implementiere diese Methode
		// Remove before use:
		// Thread.sleep(666);
		occupied.acquire();
		Exam consumed;
		synchronized (this) {
			consumed = data[first];
			first = (first + 1) % data.length;
		}
		free.release();
		return consumed;
	}

	public void produce(Exam e) throws InterruptedException {
		// TODO: Implementiere diese Methode
		// Remove before use:
		// Thread.sleep(666);
		free.acquire();
		synchronized (this){
			data[last] = e;
			last = (last + 1) % data.length;
		}
		occupied.release();
	}
}