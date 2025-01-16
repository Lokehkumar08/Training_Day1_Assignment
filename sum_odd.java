import java.util.Scanner;
public class sum_odd {
	public static int sumOdd(int N) {
		int sum=0;
		for (int i =0;i<=N;i++) {
			if (i%2 !=0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(sumOdd(N));
		scanner.close();
		
		
	}
	

}
