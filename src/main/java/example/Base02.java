package example;

public class Base02<T extends Super01> {
	private T t;

	public Base02(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}

	public void set(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Base02";
	}
}
