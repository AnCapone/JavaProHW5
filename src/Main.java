import java.util.*;

public class Main {
    public static void main(String[] args) {
        findOccurrence(toList(new String[]{"Sun", "Moon", "Cat", "Dog", "House", "Book", "Car", "House", "Friend",
                "Love", "Music", "Cat", "Sky", "Moon", "Cat", "Love", "Sky", "Phone", "Dog", "Dream"}));


    }

    public static int countOccurance(ArrayList<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static <T> ArrayList<T> toList(T[] arr) {
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }

    public static void findUnique(ArrayList<Integer> inputList) {
        Set<Integer> inputSet = new HashSet<>(inputList);
        List<Integer> uniqueList = new ArrayList<>();

        for (Integer numberInSet : inputSet) {
            int count = 0;
            for (Integer num : inputList) {
                if (numberInSet.equals(num)) {
                    count++;
                }
            }
            if (count == 1) {
                uniqueList.add(numberInSet);
            }
        }

        System.out.println(uniqueList);
    }

    public static void calcOccurance(ArrayList<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + countOccurance(list, word));
        }
    }

    public static void findOccurrence(ArrayList<String> list) {
        Set<String> uniqueWords = new HashSet<>(list);
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : uniqueWords) {
            map.put(word, countOccurance(list, word));
        }
        System.out.println("[");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("{name: \"" + entry.getKey() + "\", occurrence: " + entry.getValue() + "}");
        }
        System.out.println("]");
    }
}