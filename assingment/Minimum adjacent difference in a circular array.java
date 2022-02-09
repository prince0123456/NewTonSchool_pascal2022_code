//Minimum adjacent diff in a circular array
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	   Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		while (testcases>0)
		{
			int N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}

			int min = Math.abs(arr[0] -arr[1]);
			for(int i=1;i<N-1;i++)
			{
				int diff = Math.abs(arr[i]-arr[i+1]);
				if (diff<min)
				{
					min=diff;
				}
			}
			int circularDiff= Math.abs(arr[N-1]-arr[0]);
			if(circularDiff < min)
			{
				min = circularDiff;
			}
			System.out.println(min);
			testcases--;
		}
	}
}