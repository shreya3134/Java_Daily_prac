

public class subsequence{
    
    public static void printSubsequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.err.println(newString);
            return;
        }
        
        char currChar=str.charAt(idx);
        
        printSubsequence(str,idx+1,newString+currChar);
        
        printSubsequence(str,idx+1,newString);
        
    }
    
    public static void main (String args[]){
        String str="abc";
        System.out.println("The subsequence of the string "+str+" are: ");
        printSubsequence(str,0,"");
    }
}