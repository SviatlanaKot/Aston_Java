package TaskL13_Exercise_1;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("grape");
        arr.add("orange");
        arr.add("apple");
        arr.add("orange");
        arr.add("kiwi");
        arr.add("kiwi");
        arr.add("melon");
        arr.add("grape");
        arr.add("melon");
        arr.add("pineapple");
        arr.add("blueberry");
        arr.add("pineapple");
        arr.add("pineapple");
        arr.add("pineapple");

        Set<String> uniqueWords = new HashSet<>(arr);
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordsCount = new HashMap<>();
        for(String words: arr) {
            if (wordsCount.containsKey(words)) {
                wordsCount.put(words, wordsCount.get(words) + 1);
            } else {
                wordsCount.put(words, 1);
            }
        }
        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
