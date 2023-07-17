import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        int[] oddNumbers = new int[a];
        if(a%2==0){
            int n=a-1;
            int i=1;
            for(int j=0;j<n;j++){
                oddNumbers[j]=i;
                i=i+2;
            }
            for(int j=0;j<n;j++){
                System.out.print(oddNumbers[j]+ " ");
            }
        }
        else{
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
}

