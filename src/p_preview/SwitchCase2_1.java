package p_preview;

import java.util.Scanner;

public class SwitchCase2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �� ���ٸ� �Է��ϼ��� >>");
		int floor = sc.nextInt();

		switch (floor) {
		case 1:
			System.out.println(floor + "�� �౹�Դϴ�");
			break;
		case 2:
			System.out.println(floor + "�� �����ܰ��Դϴ�");
			break;
		case 3:
			System.out.println(floor + "�� �Ǻΰ��Դϴ�");
			break;
		case 4:
			System.out.println(floor + "�� ġ���Դϴ�");
			break;
		case 5:
			System.out.println(floor + "�� �ｺ Ŭ���Դϴ�");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~5�� �߿� �Է����ֻ�");
			break;
		}

	}

}
