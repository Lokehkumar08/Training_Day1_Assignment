import java.util.Scanner;
public class Total_odd {
	public static int totalOdd(int N) {
		int count = 0;
		for(int i=0;i<=N;i++) {
			if(i%2 !=0) {
				count += 1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(totalOdd(N));
		sc.close();
	}

}
