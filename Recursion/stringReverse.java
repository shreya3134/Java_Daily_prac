public class stringReverse{
    
    public static void reverseStr(String str, int idx){
        
        char currChar = str.charAt(idx);
        if(idx==0){
            System.out.println(currChar);
            return ;
        }
        
    
        System.out.println(currChar);
        reverseStr(str,idx-1);
    }
    
    public static void main (String[] args) {
        String str="abcd";
        System.out.println("Reverse of the String " + str +" is");
        reverseStr(str,str.length()-1);
    }
    
}