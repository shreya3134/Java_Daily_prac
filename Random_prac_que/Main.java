/******************************************************************************
Find the 1st non repeating character in a string.if all character repeat return -1

*******************************************************************************/
import java.util.*;

public class Main {

    public static char firstNonRepeatingChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If no non-repeating character, return special char
        return '-';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabbccde")); // Output: d
        System.out.println(firstNonRepeatingChar("aabb"));     // Output: -
    }
}





/******************************************************************************
Find the 1st non repeating character in a string.if all character repeat return -1


import java.util.*;
public class Main{


public class FirstUniqueCharacter{
    public static char firstNonRepeatingChar(String str){
        Map<Character, Integer>countMap=new LinkedHashMap<>;
        
        for(char ch:str.toCharArray().getOrDefault(ch,0)+1);
    }
    for(Map.Entry<Character, Integer>entry:countMap.entrySet()){
        if(entry.getValue()==1){
            return entry.getKey();
        }
    }
    return -1;
    }
    
    
	public static void main(String[] args) {
		System.out.println(FirstUniqueCharacter("aabbccde"));
		System.out.println(FirstUniqueCharacter("aabb"));
	}
}

*******************************************************************************/
