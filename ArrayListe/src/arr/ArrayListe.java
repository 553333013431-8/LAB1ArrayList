package arr;

import java.util.Arrays;

public class ArrayListe {

	private Object edata[] = new Object[1];
	private int size = 0;

	public void add(Object o) {
		add(size, o);
	}

	public void add(int i, Object o) {
		ensureCapacity(size + 1);
		for (int j = size - 1; j >= i; j--) {
			edata[j + 1] = edata[j];
		}
		edata[i] = o;
		size++;
	}

	public void ensureCapacity(int capacity) {
		if (capacity > edata.length) {
			int s = 2 * edata.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size; i++) {
				arr[i] = edata[i];
			}
			edata = arr;
		}
	}

	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			edata[j] = edata[j + 1];
		}
		edata[size - 1] = null;

	}

	public void addFirst(Object o) {
		add(0, o);
	}

	public void addLast(Object o) {
		add(size, o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListe num = new ArrayListe();
		num.add("A");
		num.add("B");
		num.add("C");
		num.add("D");
		num.add("E");
		num.add("F");
		num.add("G");
		System.out.println(num);

	}

	@Override
	public String toString() {
		Object arr[] = new Object[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = edata[i];
		}
		return Arrays.toString(arr);
	}

	public int size() {

		return size;
	}

	public Object get(int i) {
		Object get = edata[i];
		return get;
	}
}