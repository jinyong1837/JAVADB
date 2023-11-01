import java.util.Scanner;
public class forthHomeWork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 10개를 입력하시오>>");
		int A[] = new int[10]; //배열 생성 및 크기 초기화 
		
		for(int i=0;i<10;i++) {
			A[i]=scan.nextInt(); /*A[0]부터 한개씩 입력한 정수가 들어간다.*/
		}//10개 다 채우면 반복문을 나온다.
		
		System.out.print("입력된 배열들 >>");
		/*for(int i : A) {
			System.out.print(i+" ");
		}*/
		for(int i=0;i<A.length;i++) {
			int k=A[i];System.out.print(k+" ");
		}
		
		//3의 배수만 다시 찾아서 출력.
		System.out.print("\n3의 배수들 >> ");
		for(int k:A){
			if(k%3==0)
				System.out.print(k+" ");
		}
		
		scan.close();
		
		}
	}


