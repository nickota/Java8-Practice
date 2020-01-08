package example;

@FunctionalInterface
public interface CheckWonLottery {
	// 抽象メソッド
	abstract public String check(Integer inNnumber, Integer winNumber);
}
