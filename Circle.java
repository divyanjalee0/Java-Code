import java.util.Scanner;
public class Circle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double rad;
        double area;
        double volume;
        double cir;

        System.out.println("Enter the radius :");
        rad = scanner.nextDouble();

        // area =  pi * r * r

        area =  Math.PI * Math.pow(rad,2);
        System.out.printf("The area of circle is %.1fcm^2\n" , area);


        // circumference = 2 * pi * r

        cir = 2 * Math.PI *rad;
        System.out.printf("The circumference of the circle is %.1f cm\n", cir);

        // volume =4/3 * pi * r * r * r

        volume = 4.0/3.0 * Math.PI * Math.pow(rad ,3);
        System.out.printf("Volume of the Circle is : %.1fcm^3",volume);


    }
}
