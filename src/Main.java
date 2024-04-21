import java.util.*;

public class Main {
    public static void main(String[] args) {
        findUnique(toList(new Integer[]{42, 17, 28, 17, 64, 9, 73, 51, 36, 73, 64, 9}));

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
}