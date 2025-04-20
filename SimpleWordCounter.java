import java.util.*;

public class SimpleWordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = sc.nextLine();
        
        String[] words = text.split(" ");
        HashMap<String, Integer> counter = new HashMap<>();
        
        for (String word : words) {
            if (counter.containsKey(word)) {
                counter.put(word, counter.get(word) + 1);
            } else {
                counter.put(word, 1);
            }
        }
        
        System.out.println("Word counts:");
        for (String word : counter.keySet()) {
            System.out.println(word + ": " + counter.get(word));
        }
    }
}