//Maxi Mini in an Array
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		  Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T >= 1) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println(getMinMax(A, N));
            T--;
        }
	}
	  public static int getMinMax(int[] A, int N) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
            if (A[i] < min) {
                min = A[i];
            }
        }
        System.out.print(max + " ");
        return min;
    }

}