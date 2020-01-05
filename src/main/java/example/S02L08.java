package example;

public class S02L08 {
	public static void main(String[] args) {

		// 1. Stringのみを保存するArrayListの生成
		BaseList01<String> list01 = new BaseList01<>();
		list01.create();
		list01.add("DOG");
		list01.add("CAT");
		System.out.println(list01); // [DOG, CAT]

		// 2. Super01およびSuper01を継承するオブジェクトを保存するArrayListの生成
		BaseList01<Super01> list02 = new BaseList01<>();
		list02.create();
		list02.add(new Super01());
		list02.add(new Sub0101());
		list02.add(new Sub0102());
		System.out.println(list02); // [Super01, Sub0101, Sub0102]
	}
}
