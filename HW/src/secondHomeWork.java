import java.util.Scanner; /*�� ������ �����ؾ� ��ĳ�ʸ� Ȱ���� �� �ִ�*/
public class secondHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cf =new Scanner(System.in); //�ʼ� 
		System.out.print("���������� - 2000��\n�Ƹ޸�ī�� - 2500��\nīǪġ��  -  3000��\nī���  -  3500��");
		System.out.print("\n\n���Ḧ �ֹ��ϼ���>>>");
		
		String beverages=cf.next(); // ���� ����
		int Q=cf.nextInt(); //����
		
		/*�ҹ��� s�� ����ġ�� ������ ��*/
		switch(beverages) {
		
		case "ī���":
			System.out.print("�ֹ��Ͻ� ����� "+beverages+"�̸� ������ "+Q+"�� �Դϴ�. ��"+3500*Q+"�� �Դϴ�.");
			break;
		case "�Ƹ޸�ī��":
			System.out.print("�ֹ��Ͻ� ����� "+beverages+"�̸� ������ "+Q+"�� �Դϴ�. ��"+2500*Q+"�� �Դϴ�.");
			break;
		case "īǪġ��":
			System.out.print("�ֹ��Ͻ� ����� "+beverages+"�̸� ������ "+Q+"�� �Դϴ�. ��"+3000*Q+"�� �Դϴ�.");
			break;
		case "����������":
			System.out.print("�ֹ��Ͻ� ����� "+beverages+"�̸� ������ "+Q+"�� �Դϴ�. ��"+2000*Q+"�� �Դϴ�.");
			break;
			
			
		
		}

		cf.close();
	}

}
