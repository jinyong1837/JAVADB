import java.util.Scanner;
public class thirdHomeWork {

	//���θ޼ҵ�
	public static void main(String[] args) {
		Scanner sch=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		
		String score=sch.next();
		
		switch(score) {
		
		case "A":
			System.out.print("Excellent!"); break;
		case "B":
			System.out.print("Excellent!"); break;
		case "C":
			System.out.print("Good!"); break;
		case "D":
			System.out.print("Good!"); break;
		case "F":
			System.out.print("Bye!"); break;
		default:
			System.out.print("�ٽ� �Է��Ͻÿ�");
		}
		
		sch.close();
	}

}
