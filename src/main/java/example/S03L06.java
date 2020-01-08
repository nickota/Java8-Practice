package example;

public class S03L06 {
	public static void main(String[] args) {
		CheckWonLottery cw = new CheckWonLottery() {
			@Override
			public String check(Integer n1, Integer n2) {
				if (n1 == n2)
					return "的中";
				else
					return "外れ";
			}
		};
		String result = cw.check(10555, 105559);
		System.out.println(result); // 外れ
	}
}
