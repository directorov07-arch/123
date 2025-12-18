import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Сar car1 = new Сar(4, "Red", "Petrol");


        Сar car2 = new Сar();
        car2.setWheels(6);
        car2.setColor("Blue");
        car2.setEngine("Diesel");

        System.out.println("Car 1:");
        System.out.println("Wheels: " + car1.getWheels());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Engine: " + car1.getEngine());

        System.out.println("Car 2:");
        System.out.println("Wheels: " + car2.getWheels());
        System.out.println("Color: " + car2.getColor());
        System.out.println("Engine: " + car2.getEngine());

        Scanner scanner = new Scanner(System.in);

        Сar car3 = new Сar();
        car3.setColor(scanner.nextLine());
        car3.setWheels(scanner.nextLine());
        car3.setEngine(scanner.nextLine());

        




        System.out.println("Write quantity wheels for Car3:");
        int wheels3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Write color for Car3:");
        String color3 = scanner.nextLine();
        System.out.println("Write type engine for Car3:");
        String engine3 = scanner.nextLine();

    }
}
