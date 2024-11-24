import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.println("Таблиця синусів:");

        for (int градус = 0; градус <= 90; градус++) {
            double синус = Math.sin(Math.toRadians(градус));

            System.out.printf("%3d°: %.4f", градус, синус);

            if ((градус + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }
}
