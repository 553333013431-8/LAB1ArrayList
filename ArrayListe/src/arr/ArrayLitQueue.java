package arr;

public class ArrayLitQueue {

	private ArrayListe alq = new ArrayListe();

	public Object peek() {
		return alq.get(0);
	}

	public Object dequeue() {
		Object obj = alq.get(0);
		alq.remove(0);
		return obj;
	}

	public void enqueue(Object o) {
		alq.add(o);
	}

	public static void main(String[] args) {
		ArrayLitQueue alq1 = new ArrayLitQueue();
		alq1.enqueue("11");
		alq1.enqueue("22");
		alq1.enqueue("33");
		alq1.enqueue("44");
		alq1.dequeue();
		System.out.println(alq1);

	}

	@Override
	public String toString() {
		return String.valueOf(alq);
	}

}
