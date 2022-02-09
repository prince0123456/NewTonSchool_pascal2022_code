package selfwork;

import java.util.Scanner;

public class CheckNumIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
       int n =sc.nextInt();
       if(n%2==0) {
    	   System.out.println("this is not prime number");
       }else {
    	   System.out.println("this is prime number");
       }
	}

}
