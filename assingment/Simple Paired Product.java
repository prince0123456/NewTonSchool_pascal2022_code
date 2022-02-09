import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
		byte n=s.nextByte();
		if(n%2!=0){
			System.out.print("Invalid input");
		}
		long[] arr=new long[n];
		for(byte i=0;i<n;i++){
			arr[i]=s.nextLong();
		}
		long[] product=new long[n/2];
		for(byte i=0;i<n/2;i++){
			product[i]=arr[i*2]*arr[i*2+1];
			System.out.print(product[i]+" ");
	}
}
}