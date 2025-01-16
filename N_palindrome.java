import java.util.Scanner;
public class N_palindrome {
	public static boolean isPal(int N) {
		int org = N;
		int reverse = 0;
		while(N!=0) {
			int digit =N%10;
			reverse = reverse*10+digit;
			N = N/10;
		}
		return reverse==org;
		
	}
	public static void printt(int num) {
		for (int i=0;i<=num;i++) {
			if(isPal(i)) {
				System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printt(num);
		sc.close();
		
		
	}

}
