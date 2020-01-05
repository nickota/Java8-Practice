package example;

public class S02L03 {

	public static void main(String[] args) {
		Base01<String> b01_1 = new Base01<>("Base01_String");
		Base01<Integer> b01_2 = new Base01<>(100);
		Base02<Super01> b02 = new Base02<>(new Super01());

		System.out.println(b01_1.get()); // Base01_String
		System.out.println(b01_2.get()); // 100
		System.out.println(b02.get()); // Super01

		System.out.println(b01_1); // Base01
		System.out.println(b01_2); // Base01
		System.out.println(b02); // Base02
	}
}
