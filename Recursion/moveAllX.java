public class moveAllX{
    
    public static void movex(String str, int idx,int count, String newString){
        
        if(idx==str.length()){
            for (int i=0;i<count;i++){
               newString+='x';
            }
            System.out.println(newString);
            return;
        }
        
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            movex(str,idx+1,count,newString);
        }
        
        else{
            newString+=currChar;
            movex(str,idx+1,count,newString);
        }
        
    }
    
    public static void main(String args[]){
        String str="abxxcxd";
        System.out.println("From the String " + str + " all the x are moved at the end ");
        movex(str,0,0,"");
    }
}
    