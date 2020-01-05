package example;

public class S02L05 {
	public static void main(String[] args) {
		// 確認事項 class Base02<T extends Super01> {

		Base02<Super01> b02_super01 = new Base02<>(new Super01());
		Base02<Sub0101> b02_sub0101 = new Base02<>(new Sub0101());
		Base02<Sub0101> b02_sub0102 = new Base02<>(new Sub0102());

		System.out.println(b02_super01.get()); // Super01
		System.out.println(b02_sub0101.get()); // Sub0101
		System.out.println(b02_sub0102.get()); // Sub0102
	}
}
