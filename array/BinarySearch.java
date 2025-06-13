/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 87, 90, 2, 23};
        Arrays.sort(arr);  // Binary search needs sorted array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
