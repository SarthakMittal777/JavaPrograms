import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "Better Butter";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Iterate over each character in the array
        for (char c : charArray) {
            // If the character is already present in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not present in the map, add it with count 1
                charCountMap.put(c, 1);
            }
        }

        // Print the duplicate characters and their count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
public class string {
    
}
