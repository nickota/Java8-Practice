package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseList01<E> {
	private List<E> e;

	// 新規作成
	public void create() {
		this.e = new ArrayList<E>();
	}

	public List<E> get() {
		return this.e;
	}

	// boolean add(E e)
	public void add(E element) {
		e.add(element);
	}

	// 初期化
	// static<T> List<T> asList(T...a)
	public void setArray(E[] array) {
		this.e = Arrays.asList(array);
	}

	@Override
	public String toString() {
		return e.toString();
	}

}
