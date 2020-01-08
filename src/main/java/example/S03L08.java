package example;

import java.util.function.Consumer;

public class S03L08 {
	public static void main(String[] args) {
		// 構文：abstract void accept(T t)
		Consumer<String> cs1 = new Consumer<String>() {
			@Override
			public void accept(String inStr) {
				System.out.println("cs1" + inStr);

			}
		};
		cs1.accept("の実行");

		Consumer<String> cs2 = new Consumer<String>() {
			@Override
			public void accept(String inStr) {
				System.out.println("cs2" + inStr);

			}
		};
		cs2.accept("の実行");

		Consumer<String> cs3 = cs1.andThen(cs2);
		System.out.println("以下、cs3の実行結果");
		cs3.accept("の実行"); // cs1とcs2のオブジェクトが連続実行
	}
}
