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

        Map<Integer, Integer> integerMap = new LinkedHashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!integerMap.containsKey(numbers[i])) {
                integerMap.put(sum - numbers[i], i);
            } else {
                System.out.println(integerMap.get(numbers[i]));
                System.out.println(i);
                break;

            }


        }
    }
}
