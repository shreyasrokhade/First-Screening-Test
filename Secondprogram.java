import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        int[] oddNumbers = new int[a];
        int i = 1;
        for (int j = 0; j < a; j++) {
            oddNumbers[j] = i;
            i = i + 2;
        }
        for (int j = 0; j < a; j++) {
            System.out.print(oddNumbers[j] + " ");
        }
    }
}
