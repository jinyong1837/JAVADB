//import java.util.*; //java.util.Scanner;
//public class homework6 {
//
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.print(" + �� ����� �������� �Է��Ͻÿ� >> ");
//		String a = sc.nextLine(); // String�� nextLine() �̾���.
//		
//		StringTokenizer st = new StringTokenizer(a,"+"); // �Է��� ���ڿ��� +�� �������� ��� �и��ϱ�.
//		int n = st.countTokens();
//		System.out.print("��ū�� ���� >> "+n);
//		
//		int sum=0; // �� ���� ���Ϸ��� �ʿ���.
//		
//		//���ڿ����� ���������� ��ȯ�� �ʿ��ϴ�.
//		String token;
//		String t;
//		for(int i=0;i<n;i++) {		
//			token = st.nextToken(); // ��ū ���.		
//			t=token.trim(); //�� �� ���� ����.
//			sum+=Integer.parseInt(t); // ���ڿ��� ���������� ��ȯ.
//		} // �ݺ��� ��� -> �Է��� �� �ڷ� �� ����.
//		
//		System.out.print("\t�� ���� >>"+sum);
//		
//	}
//
//}
