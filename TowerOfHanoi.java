public class TowerOfHanoi{
    
    public static void TOHanoi (int n, String scr, String helper , String dest){
        
        if(n==1){
            System.out.println("Tranfer disk "+ n + " from "+scr+" to "+dest);
            return;
        }
        TOHanoi(n-1, scr , dest , helper);
        System.out.println("Tranfer disk "+ n + " from "+ scr +" to "+  dest);
        TOHanoi(n-1, helper , scr, dest);
        
    }
    
    public static void main(String[] args){
        int n=3;
        
        TOHanoi(n,"S","H","D");
    }
    
    
    
}