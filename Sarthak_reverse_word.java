import java.util.*;
public class Sarthak_reverse_word {
public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Java Concept Of The Day";
        String[] words = sentence.split(" ");
        List<String> rev = new ArrayList<>();

        for (int i = words.length - 1; i >= 0; i--) {
            rev.add(words[i]);
        }

        String revSentence = String.join(" ", rev);
        System.out.println(revSentence);
    }
}
}
