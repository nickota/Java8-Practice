package example;

public class S03L04 {
	public static void main(String[] args) {
		// 静的メソッドはnewしなくても実行可能
		SampleInterface.printStatic();
		// 抽象メソッドが未オーバーライドなのでコンパイルエラー
		// SampleInterface si1 = new SampleInterface(){};
	}
}
