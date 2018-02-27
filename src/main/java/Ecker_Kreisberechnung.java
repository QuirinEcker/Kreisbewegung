import java.util.Scanner;

public class Ecker_Kreisberechnung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius;
        int xCoordinates;
        int yCoordinates;

        System.out.println("Kreisberechnung");
        System.out.println("===============");

        System.out.print("Radius des Kreises       : ");
        radius = scanner.nextInt();
        System.out.print("x-Koordinate des Punktes : ");
        xCoordinates = scanner.nextInt();
        System.out.print("y-Koordinate des Punktes : ");
        yCoordinates = scanner.nextInt();

        pointCalculation(radius, xCoordinates, yCoordinates);
    }

    public static boolean pointCalculation(int radius,  int xCoordinates, int yCoordinates){
        boolean pointCoordinates = false;




        return pointCoordinates;
    }
}
