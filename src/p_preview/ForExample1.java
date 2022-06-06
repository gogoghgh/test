package p_preview;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum;
		for (i = 1, sum=0; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("1~10 합은>> " +sum);
		
		int j;
		for (j=1; j<=10; j++) {
			System.out.println("안녕하세요"+j);
		}
	}

}
