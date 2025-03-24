/******************
 Unique Subsequence of a String
 
 ****************/

import java.util.HashSet;
public class uSubsequence{
    
    public static void printSubsequence(String str, int idx, String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
            return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        
        char currChar=str.charAt(idx);
        
        printSubsequence(str,idx+1,newString+currChar,set);
        
        printSubsequence(str,idx+1,newString,set);
        
    }
    
    public static void main (String args[]){
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        System.out.println("The subsequence of the string "+str+" are: ");
        printSubsequence(str,0,"",set);
    }
}