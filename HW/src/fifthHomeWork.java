import java.util.Scanner;
public class fifthHomeWork {

	public static void main(String[] args) {
		String A[]= {"사람","동물","식물"};
		String B[]= {"Human","Animal","Plant"};
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.print("어휘를 입력하시오>>");
			String voca=scan.next(); //영단어를 입력받음
			
			if(voca.equals("exit"))break; // exit 누르면 중지
			
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
