/******************************************************************************

                           Backtracking 
      Find all the possible solutions and choose the best solution(track)
*******************************************************************************/

    
   public class Backtracking {

    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i=0;i<str.length();i++) {
            char currChar= str.charAt(i);
            String newStr= str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar,idx+1);
            
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("The Backtracking of String "+str);
        printPermutation(str, "", 0);
    }
}
