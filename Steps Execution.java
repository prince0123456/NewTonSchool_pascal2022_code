import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
       Scanner sc = new Scanner(System.in);
       //System.out.println("Enter Number");
       int number = sc.nextInt();
       //System.out.println(number);
       if(number>=1000 && number<=9999){
           int result = 0;
           result=(((number+8)/3)%5)*5;
           System.out.println(result);
       }
	}
}