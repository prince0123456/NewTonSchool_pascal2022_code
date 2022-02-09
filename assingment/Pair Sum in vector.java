import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
					  int n = sc.nextInt();
					  int[] arr = new int[2*n];
					  for(int i=0; i<2*n; i++){
						  arr[i] = sc.nextInt();
					  }
					  long sum = 0;
					  for(int i=0; i<2*n; i++)
					  {
						  if( i%2!=0)
						  sum=sum+arr[i];
						 
					  }		 
						  
					  System.out.println(sum);
	
	}
}