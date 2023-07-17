import java.util.*;

public class CountMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers (separated by commas): ");
        String input = scanner.nextLine();
        List<Integer> numbers = parseNumbers(input);

        Map<Integer, Integer> countMap = countMultiples(numbers);

        System.out.println(countMap);
    }

    public static List<Integer> parseNumbers(String input) {
        List<Integer> numbers = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            numbers.add(Integer.parseInt(part.trim()));
        }
        return numbers;
    }

    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int factor = 1; factor <= 9; factor++) {
            int count = 0;
            for (int number : numbers) {
                if (number % factor == 0) {
                    count++;
                }
            }
            countMap.put(factor, count);
        }

        return countMap;
    }
}
