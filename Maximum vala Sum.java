import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		//constrain
		if(n<=10000 && n>=1){
		long sum =0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				sum =sum+arr[i];
			}
		}
		 System.out.print(sum);
		}
	}
}