//import java.util.*; //java.util.Scanner;
//public class homework6 {
//
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.print(" + 로 연결된 덧셈식을 입력하시오 >> ");
//		String a = sc.nextLine(); // String은 nextLine() 이었다.
//		
//		StringTokenizer st = new StringTokenizer(a,"+"); // 입력한 문자열을 +로 기준으로 잡고 분리하기.
//		int n = st.countTokens();
//		System.out.print("토큰의 개수 >> "+n);
//		
//		int sum=0; // 총 합을 구하려면 필요함.
//		
//		//문자열에서 정수형으로 변환이 필요하다.
//		String token;
//		String t;
//		for(int i=0;i<n;i++) {		
//			token = st.nextToken(); // 토큰 얻기.		
//			t=token.trim(); //앞 뒤 여백 지움.
//			sum+=Integer.parseInt(t); // 문자열을 정수형으로 변환.
//		} // 반복문 결과 -> 입력한 값 귿로 잘 나옴.
//		
//		System.out.print("\t총 합은 >>"+sum);
//		
//	}
//
//}
