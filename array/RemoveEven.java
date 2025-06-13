/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class RemoveEven
{
	public static void main(String[] args) {
		int [] arr = {1,4,87,90,2,23};
		
		int i,countOdd;
		countOdd=0;
		for(i=0;i<arr.length;i++){
		    if(arr[i] % 2 != 0){
		        countOdd++;
		    }
		}
		
		int[] Oddarr = new int[countOdd];
        int idx = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                Oddarr[idx] = arr[i];
                idx++;
            }
        }
		
		System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Odd Numbers Array: " + Arrays.toString(Oddarr));
	}
}