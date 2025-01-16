import java.util.Scanner;
public class N_Prime_sum_avg {
	public static boolean primeSumAvg(int N) {
		if(N<=1) {
			return false;
		}
		for (int i=2;i<Math.sqrt(N);i++) {
			if(N%i==0) {
				return false;
			}
			
	}
		return true;
	}
		
	
	
	public static void isPrimesumavg(int num) {
		int sum=0;
		int count=0;
		for (int i=0;i<num;i++) {
			if(primeSumAvg(i)) {
				sum +=i;
				count +=1;
				System.out.println(i + " ");
				
				
			}
		}
		int avgg = sum/count;
		System.out.println("sum : " + sum + " " + "avg : " + avgg);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isPrimesumavg(num);
		sc.close();
	}
}

