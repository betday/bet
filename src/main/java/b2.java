import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập nhiệt độ trong Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " độ Celsius tương đương với " + fahrenheit + " độ Fahrenheit.");
        }
}
