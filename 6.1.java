import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 15;
        int[] arr = new int[n];
        Random rand = new Random();

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(50);
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Парних: " + evenCount);
        System.out.println("Непарних: " + oddCount);
    }
}
