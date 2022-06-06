package p_preview;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;

		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0)
				continue;
			total += num;
			System.out.println("현 num >> " +num +" / 현 total> " + total);
		}
		System.out.println();
		System.out.println("1~100까지 홀수의 합은>> " + total);
	}

}
