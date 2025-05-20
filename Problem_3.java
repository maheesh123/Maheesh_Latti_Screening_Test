import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // Calculate how many odd numbers to print
        int count;
        if (a % 2 == 0) {
            count = a - 1;
        } else {
            count = a;
        }

        // Print the odd numbers
        int number = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(number);
            if (i < count - 1) {
                System.out.print(", ");
            }
            number += 2;
        }

        sc.close();
    }
}
