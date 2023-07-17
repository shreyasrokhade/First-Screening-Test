import java.util.*;

public class CountMultiples {
    public static Map<Integer, Integer> countMultiples(List<Integer> numbers, List<Integer> factors) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Initialize the count map with factors and initial counts set to zero
        for (int factor : factors) {
            countMap.put(factor, 0);
        }

        // Iterate through each number and count multiples for each factor
        for (int number : numbers) {
            for (int factor : factors) {
                if (number % factor == 0) {
                    int count = countMap.get(factor);
                    countMap.put(factor, count + 1);
                }
            }
        }

        return countMap;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        List<Integer> factors = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Integer, Integer> result = countMultiples(numbers, factors);
        System.out.println(result);
    }
}
