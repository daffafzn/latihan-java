import java.util.Scanner;

public class QueueArray {
	private static final int MAX_SIZE = 10;
	private int[] queue;
	private int belakang; 
	private int depan; 
	
	public QueueArray() {
	    queue = new int[MAX_SIZE];
		belakang = -1;
		depan = -1;
	}

	public void enqueue(int item) {
		if ((depan + 1) % MAX_SIZE == belakang) {
			System.out.println("ERROR: Queue Sudah Penuh");
			return;
		}

		if (belakang == -1 && depan == -1) {
			belakang = depan = 0;
		} else {
			depan = (depan + 1) % MAX_SIZE;
		}
		queue[depan] = item;
	}

	public int dequeue() {
	    int item;
		if (depan == -1 && belakang == -1) {
			System.out.println("ERROR: Queue Masih Kosong");
			return -999999;
		}
		item = queue[belakang];
		
		if (belakang == depan) {
		    belakang = depan = -1;
		} else {
	    	belakang = (belakang + 1) % MAX_SIZE;
		}
		return item;

	}
	public int getFront() {
		if (depan == -1 && belakang == -1) {
			System.out.println("ERROR: Queue is empty");
			return -999999;
		}

		return queue[belakang];
	}

	public static void main(String [] args) {
		QueueArray queue = new QueueArray();
		queue.enqueue(34);
		queue.enqueue(35);
		queue.enqueue(41);
		queue.enqueue(56);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(62);
		queue.enqueue(63);
		queue.enqueue(64);
		queue.enqueue(65);
		queue.enqueue(66);
		queue.enqueue(67);
		queue.enqueue(68); 
		queue.enqueue(69); 
		System.out.println(queue.dequeue());
		queue.enqueue(70);
	}
}