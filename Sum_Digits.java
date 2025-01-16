import java.util.Scanner;
//import java.util.ArrayList;
public class Sum_Digits {
	public static int sumDigit(int N) {
		int sum=0;
		String numStr = Integer.toString(N);
		for(char ch: numStr.toCharArray()) {
			sum += Character.getNumericValue(ch);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(sumDigit(N));
		sc.close();
		
	}

}
