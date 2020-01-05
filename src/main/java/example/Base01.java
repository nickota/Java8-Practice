package example;

public class Base01<T> {
	private T t;

	public Base01(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Base01";
	}
}
