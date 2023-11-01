import java.util.Scanner; // 입력받기 위한 유틸기능 -> 필수

abstract class Calculator{
	protected int a,b;
	abstract protected int calc(); //추상 메소드
	protected void input() {
		Scanner scanner = new Scanner(System.in); //입력을 위해 필수
		System.out.print("정수 2개를 입력하세요 -> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
public void run() {
		input();
		int res= calc(); //결과값을 res에 삽입
		System.out.print("계산된 값은  >> "+res+"\n");
	}
}

class Adder extends Calculator{
	protected int calc() {
		return a+b;
	}
}
class Subtracter extends Calculator{
	protected int calc() {
		return a-b;
}	
}
public class App {
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub= new Subtracter(); //객체 생성
		
		adder.run();
		sub.run();
		System.out.print("프로그램을 종료합니다...");
	}

}
