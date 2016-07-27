import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        int menuInput;

        do {
            menuInput = showMenu();
            if ((menuInput > 3) || menuInput < 0) {
                System.out.println(" Input incorrect!!!");
            }
            else {
                switch (menuInput) {
                    case 0: System.exit(0);
                        break;
                    case 1: createTriangle();
                        break;
                    case 2: createCircle();
                        break;
                    case 3: createSquare();
                        break;
                }
            }

        }
        while (true);

    }

    public static int showMenu() {
        Scanner cs = new Scanner(System.in);

        System.out.println("1.Create triangle");
        System.out.println("2.Create circle");
        System.out.println("3.Create square");
        System.out.println("0.Exit");
        return cs.nextInt();
    }

    public static void createTriangle() {
        Scanner cs = new Scanner(System.in);
        String name;
        double sideA;
        double sideB;
        double sideC;
        System.out.println("\n Enter triangle name");
        name = cs.nextLine();
        System.out.println("Enter side A");
        sideA = cs.nextDouble();
        System.out.println("Enter side B");
        sideB = cs.nextDouble();
        System.out.println("Enter side C");
        sideC = cs.nextDouble();

        Triangle triangle = new Triangle(name, sideA, sideB, sideC);
        System.out.println(triangle.show());
    }

    public static void createCircle() {
        Scanner cs = new Scanner(System.in);
        String name;
        double radius;
        System.out.println("\n Enter circle name");
        name = cs.nextLine();
        System.out.println("Enter radius");
        radius = cs.nextDouble();

        Circle circle = new Circle(name, radius);
        System.out.println(circle.show());
    }

    public static void createSquare() {
        Scanner cs = new Scanner(System.in);
        String name;
        double side;
        System.out.println("\n Enter square name");
        name = cs.nextLine();
        System.out.println("Enter side");
        side = cs.nextDouble();

        Square square = new Square(name, side);
        System.out.println(square.show());
    }
}
