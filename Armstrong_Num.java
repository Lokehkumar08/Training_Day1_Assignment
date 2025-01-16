import java.util.Scanner;
//import java.util.ArrayList;
public class Armstrong_Num {
	public static boolean ArmNum(int N) {
		int org = N;
		int sum = 0;
		String numStr = Integer.toString(N);
		int n = numStr.length();
		while(N>0) {
			int digit = N%10;
			sum += Math.pow(digit,n);
			N /= 10;
		}
		return sum==org;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(ArmNum(N));
		sc.close();
	}
}
