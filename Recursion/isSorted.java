import java.util.Arrays;
public class isSorted{
    
    public static boolean sort(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]< arr[idx+1]){
            return sort(arr,idx+1);
        }
        else{
            return false;
        }
    }
    
    public static void main (String args[]){
        int arr[]={1,3,5};
        System.out.println("The array " + Arrays.toString(arr) + " is sorted: " + sort(arr, 0));
    }
    
}