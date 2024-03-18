public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Better Butter";
        
        // Convert the string to lowercase to ignore case sensitivity
        inputString = inputString.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            // Ignore spaces
            if (currentChar == ' ') {
                continue;
            }
            // Check if the character is already counted
           
                int count = 1;
                // Count occurrences of the character after the current position
                for (int j = i + 1; j < inputString.length(); j++) {
                    if (inputString.charAt(j) == currentChar) {
                        count++;
                    }
                }
                // Display duplicate character and count
                System.out.println(currentChar + " : " + count);
                // Replace all occurrences of the character with spaces to avoid recounting
                inputString = inputString.replace(currentChar, ' ');
            
        }
    }
    
}
