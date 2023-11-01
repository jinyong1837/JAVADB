import java.util.Scanner;
public class HomeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cf =new Scanner(System.in); //스캐너 생성
		System.out.print("에스프레소 - 2000원\n아메리카노 - 2500원\n카푸치노  -  3000원\n카페라떼  -  3500원");
		System.out.print("\n\n음료를 주문하세요>>>");
		
		String coffee=cf.next(); //종류 입력
		int Q =cf.nextInt(); // 갯수 입력

		if(coffee.equals("에스프레소"))
			System.out.print("주문하신 음료는 "+coffee+"이며 갯수는 "+Q+"개 입니다. 총"+2000*Q+"원 입니다.");
		else if(coffee.contentEquals("아메리카노"))
			System.out.print("주문하신 음료는 "+coffee+"이며 갯수는 "+Q+"개 입니다. 총"+2500*Q+"원 입니다.");
		else if(coffee.equals("카푸치노"))
			System.out.print("주문하신 음료는 "+coffee+"이며 갯수는 "+Q+"개 입니다. 총"+3000*Q+"원 입니다.");
		else if(coffee.contentEquals("카페라떼"))
			System.out.print("주문하신 음료는 "+coffee+"이며 갯수는 "+Q+"개 입니다. 총"+3500*Q+"원 입니다.");
		else 
			System.out.print("잘못 입력하셨습니다.");				
		
		cf.close();
	
	}

}
