import java.util.Scanner; // �Է¹ޱ� ���� ��ƿ��� -> �ʼ�

abstract class Calculator{
	protected int a,b;
	abstract protected int calc(); //�߻� �޼ҵ�
	protected void input() {
		Scanner scanner = new Scanner(System.in); //�Է��� ���� �ʼ�
		System.out.print("���� 2���� �Է��ϼ��� -> ");
		a = scanner.nextInt();
		b = scanner.nextInt();
	}
public void run() {
		input();
		int res= calc(); //������� res�� ����
		System.out.print("���� ����  >> "+res+"\n");
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
		Subtracter sub= new Subtracter(); //��ü ����
		
		adder.run();
		sub.run();
		System.out.print("���α׷��� �����մϴ�...");
	}

}
