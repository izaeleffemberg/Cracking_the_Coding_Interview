package questionsJava;


import java.util.*;


public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        int n = in.nextInt();
        int k = in.nextInt();

        int a[] = new int[n];
        
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            
        }
        
        int a_[] = new int[n];
        int count = 0;
        
        for(int a_i= 0; a_i < n; a_i++){
        	
        	count = a_i - k;
        	
        	if (count < 0){
        		
        		count = count+n;
        		
        	}
        	
        	a_[count] = a[a_i]; 
        	
        }
        
        
        for(int a_i=0; a_i < n; a_i++){
        
        	System.out.print(a_[a_i]+" ");
        }
        
    }
}