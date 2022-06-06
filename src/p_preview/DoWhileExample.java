package p_preview;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
			System.out.println("sum>> " + sum + "  num>> " + num);
		} while (num<=10);
		
		System.out.println("1~10 гую╨ >> " + sum);
		
	}

}
