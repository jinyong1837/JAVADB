import java.util.*;
public class chap7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, Integer> bv = new HashMap<String, Integer>();
			
			bv.put("에스프레소", 2000);
			bv.put("아메리카노", 2500);
			bv.put("카푸치노", 3000);
			bv.put("카페라떼", 3500);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라테 있습니다.");
			
			while(true) {
				Set<String> keys = bv.keySet();
				Iterator<String> it = keys.iterator();
				System.out.print("주문 >> ");
				String s = sc.next();
				if(s.equals("그만")) {
					break;
				}
				while(it.hasNext()) {
					String key = it.next();
					if(s.equals(key)) {
						System.out.println(s + "는 " + bv.get(key) + "원 입니다.");
						break;
				}

				}
				}
	}
}