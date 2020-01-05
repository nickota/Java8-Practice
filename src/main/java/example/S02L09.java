package example;

public class S02L09 {
	public static void main(String[] args) {

		BaseList01<String> list01 = new BaseList01<>();
		list01.create();

		String[] Data01 = { "DOG", "CAT" };
		list01.setArray(Data01);
		printList(list01); // [DOG, CAT]

		BaseList01<Super01> list02 = new BaseList01<>();
		list02.create();

		Super01[] Data02 = { new Super01(), new Sub0101(), new Sub0102() };
		list02.setArray(Data02);
		printList(list02); // [Super01, Sub0101, Sub0102]
	}

	public static void printList(BaseList01<?> pData) {
		System.out.println(pData);
	}
}
