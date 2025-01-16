import java.util.Scanner;

public class Pttern_Stars {
	public static void toPattern1(int n) {
		System.out.println("Pattern 1");
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void toPattern2(int n) {
		System.out.println("Pattern 2");

		for (int i=1;i<=n;i++) {
			for (int j=i ;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void toPattern3(int n) {
		System.out.println("Pattern 3");

		for (int i=1;i<=n;i++) {
			for (int j=1 ;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void toPattern4(int n) {
		System.out.println("Pattern 4");

		for(int i=1;i<=n;i++) {
			for (int j =n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	public static void toPattern5(int n) {
		System.out.println("Pattern 5");

		for(int i=1;i<=n;i++) {
			for (int j =n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		toPattern1(n);
		toPattern2(n);
		toPattern3(n);
		toPattern4(n);
		toPattern5(n);
		sc.close();
	}

}
