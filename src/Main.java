import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static int minimumPushes(String word) {
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        List<Integer> countlist = new ArrayList<>(countMap.values());

        countlist.sort(Collections.reverseOrder());

        int cost = 0;
        int index = 0;
        for (Integer count : countlist) {
            cost += ((index++ / 8) + 1) * count;
        }

        return cost;
    }

    public static void main(String[] args) {
        System.out.println(minimumPushes("xyzxyzxyzxyz"));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
