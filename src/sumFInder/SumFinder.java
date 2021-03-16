package sumFInder;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SumFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        Map<Integer, Integer> numMap = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numMap.containsKey(numbers[i])) {
                System.out.println(numMap.get(numbers[i]));
                System.out.println(i);
                break;
            } else {
                numMap.put(sum - numbers[i], i);
            }
        }
    }
}
