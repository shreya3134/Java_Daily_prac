public class pyramid_patterns
{
    // Hollow Triangle
     
	public static void main(String[] args) {
	    
	    System.out.print("Half Pyramid");
	    
	    int n=5;
	    for(int i=1; i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
	    
	     System.out.println("Inverted Half Pyramid");
	     
	     int m=5;
	    for(int a=1; a<=m;a++){
	        for(int b=1;b<=m-a+1;b++){
	            System.out.print(b+" ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println("Floyd's Triangle");
	    
	     int l=5;
	     int number=1;
	     
	    for(int c=1; c<=l;c++){
	        for(int d=1;d<=c;d++){
	            System.out.print(number+" ");
	            number++;
	        }
	        System.out.println();
	    }
	    
	    System.out.println("0's and 1's Triangle");
	    
	     int p=5;
	     
	    for(int e=1; e<=p;e++){
	        for(int f=1;f<=e;f++){
	            int sum=e+f;
	            if(sum%2==0){
	                System.out.print("1");
	            }
	            else{
	                System.out.print("0");
	            }
	        }
	        System.out.println();
	        
	    }
	    
	}	
}