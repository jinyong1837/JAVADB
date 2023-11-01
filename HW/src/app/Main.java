package app;
import util.Adder; // 클래스 이름 꼭 첨가하기.
public class Main {
	public static void main(String[] args) {
		Adder adder = new Adder(2, 5);
		System.out.println(adder.add());
	}
}