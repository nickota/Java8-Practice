package example;

public interface Se7Interface {

	// 定数（public static は省略可。）
	public static int fromHeiseiYear = 1898;

	// 抽象メソッド（abstract は省略可。）
	abstract String getData(String data);
	abstract Integer getInteger(Integer integer);
}