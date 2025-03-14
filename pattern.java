public class pattern
{
	public static void main(String[] args) {
	    int n,m;
	    n=6;
	    m=5;
	     System.out.println("Looping");
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Looping- pyramid (left)");
	    for(int a=0;a<n;a++){
	        for(int b=0;b<a;b++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Looping- pyramid (right)");
	    for(int c=n;c>1;c--){
	        for(int d=1;d<c;d++){
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Looping- inverted pyramid (right)");
	    for(int e=1;e<n;e++){
	        for(int f=1;f<n-e;f++){
	            System.out.print(" ");
	        }
	        for(int f=1;f<e;f++){
	             System.out.print("*");
	        }
	        System.out.println();
	    }
	    
	    
	    System.out.println("Looping- inverted pyramid (left)");
	     for (int s = n; s >= 1; s--) {
            // Print spaces
            for (int t = 0; t< n - s; t++) {
                System.out.print(" ");
            }

            // Print stars
            for (int t = 1; t <= s; t++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
	    
   }
	
}
