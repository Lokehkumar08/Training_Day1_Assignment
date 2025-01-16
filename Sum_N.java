import java.util.Scanner;
public class Sum_N {
	public static int sumN(int N) {
		int sum = 0;
		for (int i=0;i<=N;i++) {
			sum +=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(sumN(N));
		sc.close();
	}
	

}
