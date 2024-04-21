import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Main {
    public static void main(String[] args) {

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

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }
}