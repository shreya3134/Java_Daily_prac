
public class Recursion
{
    // Recursive method to return the sum of first n natural numbers
    public static int printSum(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: return n + sum of first (n-1) numbers
        return n + printSum(n - 1);
    }
    
    public static int Factprint(int f) {
        if (f==0 || f==1){
            return 1;
        }
        else{
            return f* Factprint(f-1);
        }
        
    }

    
    public static void main(String[] args) {
        int n = 5;
        // Print the sum of the first n natural numbers using recursion
        System.out.println("Sum of first " + n + " natural numbers is " + printSum(n));
        
        int f=5;
        System.out.println("Factorial of " + f + " is " + Factprint(f));
        
    }
}

/******************************************************************

public class Recursion
{
    // Print sum of first n natural numbers
    public static void printSum(int n) {
        
        return n + printSum(n - 1);
        //System.out.println(a);
        //int sum = (n * (n + 1)) / 2;  // Formula for sum of first n natural numbers
        //System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
    
    public static void main(String[] args) {
        //printSum(3);  // This will print the sum of the first 3 natural numbers
    
        int n=5;
        System.out.println("Sum of first " + n + " natural numbers is " + printSum(n));
    }
    
}


****************************/
