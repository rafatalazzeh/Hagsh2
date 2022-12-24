import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int some = 0;
        int i;
        Scanner scanner = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.println("Enter");
            arr[i] = scanner.nextInt();
            some = some + arr[i];


        }
        int avg = some / 10;
        for (i = 0; i < 10; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);

            }

        }
    }
}