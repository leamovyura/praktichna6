public class Main {
    public static void main(String[] args) {
        int[] angles = {90, 90, 90, 90};
        int n = angles.length;
        int sum = 0;

        for (int angle : angles) {
            sum += angle;
        }

        if (sum == 180 * (n - 2)) {
            System.out.println("Такий багатокутник може існувати.");
        } else {
            System.out.println("Такий багатокутник не може існувати.");
        }
    }
}
