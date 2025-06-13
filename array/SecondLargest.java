/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SecondLargest
{
	public static void main(String[] args) {
		int [] arr = {1,4,87,90,2,23};
		
		int max1, max2;
		
		if(arr[0]>arr[1]){
		    max1=arr[0];
		    max2=arr[1];
		}
		else{
		    max1=arr[1];
		    max2=arr[0];
		}
		
		for(int i=2;i<arr.length;i++){
		    if(arr[i]>max1){
		        max2 = max1;
		        max1 = arr[i];
		    }
		}
		System.out.println("Largest Number" + max1);
		System.out.println("Second Largest Number" + max2);
	}
}