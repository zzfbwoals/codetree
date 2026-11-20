import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ft = scanner.nextDouble();
        System.out.printf("%.1f", ft*30.48);
    }
}