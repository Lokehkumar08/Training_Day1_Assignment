
import java.util.*;
public class Palindrome {
	public static boolean isPal(int N) {
		int org = N;
		int reverse = 0;
		while(N !=0) {
			int digit = N%10;
			reverse = reverse*10+digit;
			N /= 10;
			
		}
		return reverse ==org;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(isPal(N)) {
			System.out.println(N + " is a palindrome");
		}
		else {
			System.out.println(N + " not a pal");
		}
	}
}
