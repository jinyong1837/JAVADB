import java.util.Scanner;
public class HomeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cf =new Scanner(System.in); //��ĳ�� ����
		System.out.print("���������� - 2000��\n�Ƹ޸�ī�� - 2500��\nīǪġ��  -  3000��\nī���  -  3500��");
		System.out.print("\n\n���Ḧ �ֹ��ϼ���>>>");
		
		String coffee=cf.next(); //���� �Է�
		int Q =cf.nextInt(); // ���� �Է�

		if(coffee.equals("����������"))
			System.out.print("�ֹ��Ͻ� ����� "+coffee+"�̸� ������ "+Q+"�� �Դϴ�. ��"+2000*Q+"�� �Դϴ�.");
		else if(coffee.contentEquals("�Ƹ޸�ī��"))
			System.out.print("�ֹ��Ͻ� ����� "+coffee+"�̸� ������ "+Q+"�� �Դϴ�. ��"+2500*Q+"�� �Դϴ�.");
		else if(coffee.equals("īǪġ��"))
			System.out.print("�ֹ��Ͻ� ����� "+coffee+"�̸� ������ "+Q+"�� �Դϴ�. ��"+3000*Q+"�� �Դϴ�.");
		else if(coffee.contentEquals("ī���"))
			System.out.print("�ֹ��Ͻ� ����� "+coffee+"�̸� ������ "+Q+"�� �Դϴ�. ��"+3500*Q+"�� �Դϴ�.");
		else 
			System.out.print("�߸� �Է��ϼ̽��ϴ�.");				
		
		cf.close();
	
	}

}
