import java.util.*; //scanner �ʿ�.
import java.util.Vector; //Vector �ʿ�. 

public class chap7hw1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("5���� �Ǽ� ���� �Է��Ͻÿ� >> ");
		Vector<Double> db= new Vector<Double>(); //�Ǽ��� �ٷ�� ���� ����.

		
		double a;
		
		for(int i=0; i<5;i++) {
			a=sc.nextDouble();
			db.add(a); // �Է��� �Ǽ� ���� ���Ϳ� ����. 
		}
		
		/*for(int i=0;i<db.size();i++) {
			double c=db.get(i);
			System.out.println(c);
		}*/ // �Է��� �� Ȯ�ο�
		
		double Max=0.0;
		
		for(int i=0;i<db.size();i++) {
			double n = db.get(i);
			
			if(Max<n) {
				Max=n;
			}
		}
		System.out.print("���� ū ���� >>"+Max);

	}

}
