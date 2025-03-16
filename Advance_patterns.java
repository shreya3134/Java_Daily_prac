public class Advance_patterns
{
	public static void main(String[] args) {
	    
	    int z=4;
	    for(int u=0;u<z;u++){
	         for(int v=0;v<u;v++){
	             System.out.print(" ");
	         }
	          for(int v=0;v<z-u;v++){
	             System.out.print("*");
	         }
	     System.out.println();    
	    }
	    
	    System.out.println();
	    System.out.println("Advance Patterns");
	    
	    int n=4;
	    for (int i=1;i<=n;i++){
	        // printing starts
	        for (int j=1;j<=i;j++){
	            System.out.print("*");
	        }
	        // printing spaces
	         for (int j=1;j<=2*(n-i);j++){
	            System.out.print(" ");
	         }
	         // printing starts
	         for (int j=1;j<=i;j++){
	            System.out.print("*");
	         }
	    System.out.println();
	    }
	
	     int m=4;
	    // Inverting the pattern
	    for (int a=m;a>=1;a--){
	        // printing starts
	        for (int b=1;b<=a;b++){
	            System.out.print("*");
	        }
	        // printing spaces
	         for (int b=1;b<=2*(m-a);b++){
	            System.out.print(" ");
	         }
	         // printing starts
	         for (int b=1;b<=a;b++){
	            System.out.print("*");
	         }
	    System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Solid Rhombus");
	    int q=5;
	    for (int c=0;c<q;c++){
	        for (int d=0;d<q-c;d++){
	            System.out.print(" ");
	        } 
	        for (int d=0;d<q;d++){
	            System.out.print("*");
	        } 
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Numeric Pyramid Pattern");
	    
	    int s=5;
	    for (int p=1;p<=s;p++) {
	        for (int r=0;r<=5-p;r++){
	            System.out.print(" ");
	        }
	        for (int r=1;r<=s-p;r++){
	            System.out.print(" ");
	        }
	        for (int r=1;r<=p;r++){
	            System.out.print(p+"   ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Palindromic Pattern");
	    
	    int w=5;
	    for (int x=1;x<=w;x++){
	        for (int y=1;y<=w-x;y++){
	            System.out.print(" ");
	        } 
	        for (int y=x;y>=1;y--){
	            System.out.print(y);
	        }
	        for (int y=2;y<=x;y++){
	            System.out.print(y);
	        } 
	        System.out.println();
	    } 
	    
	}
}







