import java.util.*;

public class Main {
    public static void main(String[] args) {
//        findOccurrence(toList(new String[]{"Sun", "Moon", "Cat", "Dog", "House", "Book", "Car", "House", "Friend",
//                "Love", "Music", "Cat", "Sky", "Moon", "Cat", "Love", "Sky", "Phone", "Dog", "Dream"}));
    findUnique(toList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 2, 3, 4}));

    }

    public static int countOccurrence(ArrayList<String> listForCountOccurrence, String word) {
        int count = 0;
        for (String s : listForCountOccurrence) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static <T> ArrayList<T> toList(T[] arrayToConvert) {
        ArrayList<T> resultArrayList = new ArrayList<>();
        Collections.addAll(resultArrayList, arrayToConvert);
        return resultArrayList;
    }

    public static void findUnique(ArrayList<Integer> listForFindUniqueElements) {

        List<Integer> resultListWithUniqueElements = new ArrayList<>();

        for (Integer firstElementForCheck : listForFindUniqueElements) {
            int count = 0;
            for (Integer secondElementForCheck : listForFindUniqueElements) {
                if (firstElementForCheck.equals(secondElementForCheck)) {
                    count++;
                }
            }
            if (count == 1) {
                resultListWithUniqueElements.add(firstElementForCheck);
            }
        }

        System.out.println(resultListWithUniqueElements);
    }

    public static void calcOccurance(ArrayList<String> listForCalculateOccurrence) {
        Set<String> uniqueWords = new HashSet<>(listForCalculateOccurrence);
        for (String word : uniqueWords) {
            System.out.println(word + ": " + countOccurrence(listForCalculateOccurrence, word));
        }
    }

    public static void findOccurrence(ArrayList<String> listForFindOccurrence) {
        Set<String> uniqueWords = new HashSet<>(listForFindOccurrence);
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : uniqueWords) {
            map.put(word, countOccurrence(listForFindOccurrence, word));
        }
        System.out.println("[");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("{name: \"" + entry.getKey() + "\", occurrence: " + entry.getValue() + "}");
        }
        System.out.println("]");
    }
}