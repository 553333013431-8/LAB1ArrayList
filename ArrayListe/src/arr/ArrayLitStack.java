package arr;

public class ArrayLitStack {
	private ArrayListe als = new ArrayListe();

	public void push(Object obj) {
		als.add(obj);
	}

	public Object peek() {
		return als.get(als.size());
	}

	public Object pop() {
		Object obj = peek();
		als.remove(-1);
		return obj;
	}

	@Override
	public String toString() {
		return String.valueOf(als);
	}

	public static void main(String[] args) {
		ArrayLitStack als1 = new ArrayLitStack();
		als1.push("11");
		als1.push("22");
		als1.push("33");
		als1.push("44");
		System.out.println(als1);
	}
}
