import java.util.*;
public class chap7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, Integer> bv = new HashMap<String, Integer>();
			
			bv.put("����������", 2000);
			bv.put("�Ƹ޸�ī��", 2500);
			bv.put("īǪġ��", 3000);
			bv.put("ī���", 3500);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī����� �ֽ��ϴ�.");
			
			while(true) {
				Set<String> keys = bv.keySet();
				Iterator<String> it = keys.iterator();
				System.out.print("�ֹ� >> ");
				String s = sc.next();
				if(s.equals("�׸�")) {
					break;
				}
				while(it.hasNext()) {
					String key = it.next();
					if(s.equals(key)) {
						System.out.println(s + "�� " + bv.get(key) + "�� �Դϴ�.");
						break;
				}

				}
				}
	}
}