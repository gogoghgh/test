package p_preview;

import java.util.Scanner;

public class SwitchCase2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가고싶은 층 남바를 입력하세요 >>");
		int floor = sc.nextInt();

		switch (floor) {
		case 1:
			System.out.println(floor + "층 약국입니다");
			break;
		case 2:
			System.out.println(floor + "층 정형외과입니다");
			break;
		case 3:
			System.out.println(floor + "층 피부과입니다");
			break;
		case 4:
			System.out.println(floor + "층 치과입니다");
			break;
		case 5:
			System.out.println(floor + "층 헬스 클럽입니다");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 1~5층 중에 입력해주삼");
			break;
		}

	}

}
