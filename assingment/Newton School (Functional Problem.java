static void NewtonSchool(int n){
//Enter your code here
 for (int i = 1; i <= n; i++){  
		    if (i%3==0 && i%5==0){   
		    	System.out.print("NewtonSchool");  
		    }   
		    else if (i%3==0){
		    	System.out.print("Newton");  
		    }
		    else if (i%5==0){
		    	System.out.print("School");  
		    }   
		    else{
		    	System.out.print(i);  
		    }
			System.out.print(" "); 
	    }
}