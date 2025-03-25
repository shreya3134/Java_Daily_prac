
public class insertionSort{
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
    }
    
    public static void main(String args[]){
        
        int arr[]={7,8,3,1,2};
        
        for(int i=1;i<arr.length-1;i++){
        
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        }
        
        System.out.println("The Sorted Array - through Insertion Sort");
        printArray(arr);
}
}