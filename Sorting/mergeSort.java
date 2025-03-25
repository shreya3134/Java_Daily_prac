
public class mergeSort{
    
    public static void conquer(int arr[],int start,int mid, int end){
        
        int merger[]=new int [end-start+1];
        int i=start;
        int j=mid+1;
        int x=0;
        
        while(i<=mid && j<=end){
            
            if(arr[i]<=arr[j]){
                merger[x]=arr[i];
                x++;
                i++;
            }
            
            else{
                 merger[x]=arr[j];
                 x++;
                 j++;
            }
        }
        
        while(i<=mid){
             merger[x]=arr[i];
             x++;
             i++;
        }
        while(j<=end){
             merger[x]=arr[j];
             x++;
             j++;
        }
        
        for(int u=0,v=start;u<merger.length;u++,v++){
            arr[v]=merger[u];
        }
    }
    
    public static void divide(int arr[],int start, int end){
        
        if(start>=end){
            return;
        }
        
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }
    
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
