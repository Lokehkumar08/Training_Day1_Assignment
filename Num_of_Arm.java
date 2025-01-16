import java.util.Scanner;
public class Num_of_Arm {
	public static boolean isArm(int N) {
		int org = N;
		int sum=0;
		String numStr = Integer.toString(N);
		int n = numStr.length();
		while(N>0) {
			int digit = N%10;
			sum += Math.pow(digit, n);
			N /= 10;
		}
		return sum==org;
	}
	public static void printtArm(int num) {
		for (int i=0;i<num;i++) {
			if (isArm(i)) {
				System.out.println(i);
			}
		}

}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();		
		printtArm(num);
		sc.close();
	}
}
