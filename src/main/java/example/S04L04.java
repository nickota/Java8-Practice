package example;

public class S04L04 {

	public static void main(String[] args) {
		// 静的メソッドはnewしなくても実行可能
		SampleInterface.printStatic();

		// 抽象メソッドが未オーバーライドなのでコンパイルエラー
		// SampleInterface si1 = new SamoleInterface() {};
		
		//無名（匿名）クラスを利用したオブジェクト生成
		SampleInterface si2 = new SampleInterface() {
			public void printAbstract(String inStr){
				System.out.println(inStr);
			}
		}
		
	}

}
