import java.util.*; //scanner 필요.
import java.util.Vector; //Vector 필요. 

public class chap7hw1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("5개의 실수 값을 입력하시오 >> ");
		Vector<Double> db= new Vector<Double>(); //실수만 다루는 벡터 생성.

		
		double a;
		
		for(int i=0; i<5;i++) {
			a=sc.nextDouble();
			db.add(a); // 입력한 실수 값을 벡터에 삽입. 
		}
		
		/*for(int i=0;i<db.size();i++) {
			double c=db.get(i);
			System.out.println(c);
		}*/ // 입력한 값 확인용
		
		double Max=0.0;
		
		for(int i=0;i<db.size();i++) {
			double n = db.get(i);
			
			if(Max<n) {
				Max=n;
			}
		}
		System.out.print("가장 큰 값은 >>"+Max);

	}

}
