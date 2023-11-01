import java.util.Scanner; /*위 문장을 선언해야 스캐너를 활용할 수 있다*/
public class secondHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cf =new Scanner(System.in); //필수 
		System.out.print("에스프레소 - 2000원\n아메리카노 - 2500원\n카푸치노  -  3000원\n카페라떼  -  3500원");
		System.out.print("\n\n음료를 주문하세요>>>");
		
		String beverages=cf.next(); // 음료 종류
		int Q=cf.nextInt(); //갯수
		
		/*소문자 s로 스위치문 시작할 것*/
		switch(beverages) {
		
		case "카페라떼":
			System.out.print("주문하신 음료는 "+beverages+"이며 갯수는 "+Q+"개 입니다. 총"+3500*Q+"원 입니다.");
			break;
		case "아메리카노":
			System.out.print("주문하신 음료는 "+beverages+"이며 갯수는 "+Q+"개 입니다. 총"+2500*Q+"원 입니다.");
			break;
		case "카푸치노":
			System.out.print("주문하신 음료는 "+beverages+"이며 갯수는 "+Q+"개 입니다. 총"+3000*Q+"원 입니다.");
			break;
		case "에스프레소":
			System.out.print("주문하신 음료는 "+beverages+"이며 갯수는 "+Q+"개 입니다. 총"+2000*Q+"원 입니다.");
			break;
			
			
		
		}

		cf.close();
	}

}
