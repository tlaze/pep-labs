import java.util.*;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for(char c : str.toCharArray()){
            
            Integer count = map.get(c);

            if(count == null){
                count = 0;
            }
            map.put(c, count + 1);
        }

        int maxValue = Collections.max(map.values());
        for(Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxValue){
                return entry.getKey();
            }
        }
        System.out.println(map);
        System.out.println(maxValue);

        return ' ';
    }
}
