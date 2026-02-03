import java.util.Scanner;
public class Hypotenuse {

    // HYPOTENUSE C = square root of Base (A) square + Height (B) square
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of Base (A) : ");
        a = scanner.nextDouble();

        System.out.println("Enter the Length of Height (B) :");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));

        System.out.println("Length of hypotenuse is :" + c + " cm.");



        scanner.close();
    }

}
