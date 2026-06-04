import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.println("1. Find Area");
        System.out.println("2. Find Perimeter");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            double area = length * width;
            System.out.println("Area = " + area);
        } else if (choice == 2) {
            double perimeter = 2 * (length + width);
            System.out.println("Perimeter = " + perimeter);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}