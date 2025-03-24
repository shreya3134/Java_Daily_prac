/**********************************

REMOVE DUPLICATES IN A STRING

*****************************************/

public class removeDup{
    
    public static boolean [] map = new boolean[26];
    
    public static void removeDuplicate(String str, int idx, String newString){
        
        
        
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);
        
        if(map[currChar -'a']) {
            removeDuplicate(str,idx+1,newString);
        }
        
        else{
            newString+=currChar;
            map[currChar - 'a']=true;
            removeDuplicate(str,idx+1,newString);
            
        }
    }
    
    public static void main(String args[]){
        String str="abbccda";
        removeDuplicate(str,0,"");
    }
    
}



/*****************
public class removeDup {

    public static boolean[] map = new boolean[26];  // To track if a character has already been seen.

    // Recursive function to remove duplicates.
    public static void removeDuplicate(String str, int idx, String newString) {
        // Base case: If we've processed all characters in the string, print the result.
        if (idx == str.length()) {
            System.out.println(newString);  // Print the result string without duplicates.
            return;
        }

        char currChar = str.charAt(idx);  // Get the current character at the current index.

        // If the character has already been seen (marked as true), skip it.
        if (map[currChar - 'a']) {
            removeDuplicate(str, idx + 1, newString);  // Skip adding the duplicate character and move to the next.
        } else {
            newString += currChar;  // Append the current character to the result string.
            map[currChar - 'a'] = true;  // Mark this character as seen.
            removeDuplicate(str, idx + 1, newString);  // Move to the next character.
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";  // Input string
        removeDuplicate(str, 0, "");  // Start the recursion from index 0 with an empty result string.
    }
}
***************/