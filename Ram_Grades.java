import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc= new Scanner(System.in);
        int sub1= sc.nextInt();
         int sub2= sc.nextInt();
          int sub3= sc.nextInt();
           int sub4= sc.nextInt();
        int tot=sub1+sub2+sub3+sub4;
        int per= ((tot*100)/400);
        
        System.out.println(per);
	}
	}