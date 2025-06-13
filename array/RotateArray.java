/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    
    static void reverse(int[] a, int start, int end){
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    
    static void rotate(int[]a, int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);
    }
    
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        rotate(a,3);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
