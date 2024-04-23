import java.util.*;

public class Main {
    public static void main(String[] args) {

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

    public static ArrayList<Integer> toList(Integer[] arrayToConvert) {
        ArrayList<Integer> resultArrayList = new ArrayList<>();
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
        ArrayList<String> uniqueWordsList = new ArrayList<>();
        for (String firstCheckedWordForRepeat : listForCalculateOccurrence) {
            int count = 0;
            for (String secondCheckedWordForRepeat : listForCalculateOccurrence) {
                if (firstCheckedWordForRepeat.equals(secondCheckedWordForRepeat)) {
                    count++;
                }
            }
            if (!uniqueWordsList.contains(firstCheckedWordForRepeat)) {
                uniqueWordsList.add(firstCheckedWordForRepeat);
                System.out.println(firstCheckedWordForRepeat + ": " + count);
            }
        }
    }

    public static ArrayList<String[]> findOccurrence(ArrayList<String> listForFindOccurrence) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<String[]> resultStructuredListUniqueWords = new ArrayList<>();
        System.out.println("[");
        for (String firstCheckedWordForRepeat : listForFindOccurrence) {
            int count = 0;
            if (!uniqueWords.contains(firstCheckedWordForRepeat)) {
                for (String secondCheckedWordForRepeat : listForFindOccurrence) {
                    if (firstCheckedWordForRepeat.equals(secondCheckedWordForRepeat)) {
                        count++;
                    }
                }
                uniqueWords.add(firstCheckedWordForRepeat);
                resultStructuredListUniqueWords.add(new String[]{firstCheckedWordForRepeat, String.valueOf(count)});
                System.out.println("{name: \"" + firstCheckedWordForRepeat + "\", occurrence: " + count + "}");
            }
        }
        System.out.println("]");
        return resultStructuredListUniqueWords;

    }
}