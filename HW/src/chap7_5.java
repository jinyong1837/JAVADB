import java.util.*;
public class chap7_5 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			HashMap<String, Integer> nations = new HashMap<String, Integer>();
			System.out.println("���� �̸��� �α��� 5�� �Է��ϼ���.");
			for(int i = 0; i < 5; i++) {
				System.out.print("���� �̸�, �α� >> ");
				nations.put(sc.next(), sc.nextInt());
			}
			
			Set<String> keys = nations.keySet();
			Iterator<String> it = keys.iterator();
			
			int max = 0;
			String max_cont = null;
			while(it.hasNext()) {
				String key = it.next();
				int value = nations.get(key);
				if(max < value) {
					max = value;
					max_cont = key;
				}
			}
			
			System.out.println("���� �α��� ���� ����� (" + max_cont + ", " + nations.get(max_cont) + ")");
		}
	}


