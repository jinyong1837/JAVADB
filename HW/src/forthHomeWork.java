import java.util.Scanner;
public class forthHomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭 10���� �Է��Ͻÿ�>>");
		int A[] = new int[10]; //�迭 ���� �� ũ�� �ʱ�ȭ 
		
		for(int i=0;i<10;i++) {
			A[i]=scan.nextInt(); /*A[0]���� �Ѱ��� �Է��� ������ ����.*/
		}//10�� �� ä��� �ݺ����� ���´�.
		
		System.out.print("�Էµ� �迭�� >>");
		/*for(int i : A) {
			System.out.print(i+" ");
		}*/
		for(int i=0;i<A.length;i++) {
			int k=A[i];System.out.print(k+" ");
		}
		
		//3�� ����� �ٽ� ã�Ƽ� ���.
		System.out.print("\n3�� ����� >> ");
		for(int k:A){
			if(k%3==0)
				System.out.print(k+" ");
		}
		
		scan.close();
		
		}
	}


