import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		 Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int[] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=s.nextInt();
        }
        int[] reversedArr = new int[N];
        for(int i=N-1;i>=0;i--){
            reversedArr[N-i-1]= arr[i];
        }
        int sum=0;
        long product=1;
        for(int i=0;i<N;i++){
            if(i%2!=0){
                sum=sum+reversedArr[i];
            }
            if(i%2==0){
                product=product*reversedArr[i];
            }
        }
        System.out.println(sum+" "+product);	
	}
}