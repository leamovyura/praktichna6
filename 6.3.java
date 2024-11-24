import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(50);
        }

        System.out.println("Масив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Введіть число для пошуку: ");
        int oldValue = scanner.nextInt();

        System.out.print("Введіть нове число для заміни: ");
        int newValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
                found = true;
            }
        }

        if (found) {
            System.out.println("Масив після заміни:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Число не знайдено.");
        }
    }
}
