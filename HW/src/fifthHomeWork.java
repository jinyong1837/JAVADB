import java.util.Scanner;
public class fifthHomeWork {

	public static void main(String[] args) {
		String A[]= {"���","����","�Ĺ�"};
		String B[]= {"Human","Animal","Plant"};
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.print("���ָ� �Է��Ͻÿ�>>");
			String voca=scan.next(); //���ܾ �Է¹���
			
			if(voca.equals("exit"))break; // exit ������ ����
			
			for(int i=0;i<A.length;i++) {
				if(voca.equals(A[i]))
				{
					System.out.print(B[i]);
					System.out.print("\n");
				}
					
				}
		}while(1>0);
		

	}

}
