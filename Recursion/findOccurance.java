/******************************************************************************

                           FIND THE FIRST AND THE LAST OCCURANCES OF THE STRING

*******************************************************************************/
/******************************************************************************
public class findOccurance{
    
    public static void occurances(String str, int idx, char element){
        
        int first = -1;  // Initialize first occurrence as -1 (not found)
        int last = -1;
        
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        
        char currChar = str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            
            else{
                last=idx;
            }
        }
        
        occurances(str,idx+1,element);
        
    }
    
    public static void main (String args[]){
        String str="abaacdaefaah";
        occurances(str,0,'a');
    }
    
}

*******************************************************************************/

public class findOccurance {

    // Recursive method to find the first and last occurrences of a character
    public static void occurrences(String str, int idx, char element, int[] result) {
        // Base case: if the index is beyond the length of the string, stop recursion
        if (idx == str.length()) {
            return;
        }

        // Get the current character
        char currChar = str.charAt(idx);

        // Check if the current character matches the element
        if (currChar == element) {
            // If it's the first occurrence, store it in result[0]
            if (result[0] == -1) {
                result[0] = idx;  // First occurrence
            }
            // Always update the last occurrence
            result[1] = idx;  // Last occurrence
        }

        // Recur for the next character
        occurrences(str, idx + 1, element, result);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        char element = 'a';

        // Array to store the first and last occurrence
        int[] result = {-1, -1};  // result[0] = first occurrence, result[1] = last occurrence

        // Call the recursive function to find occurrences of 'a'
        occurrences(str, 0, element, result);

        // Print the results
        System.out.println("First occurrence of '" + element + "': " + result[0]);
        System.out.println("Last occurrence of '" + element + "': " + result[1]);
    }
}


