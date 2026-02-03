import java.util.Random;
import java.util.Scanner;
public class random_number {
    public static void main(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number;
        double num;
        boolean coin;

      // Random number between 1 and 101 as integer
        number = random.nextInt(1,101);//101 will never be in the number
        // to be display on the screen
        System.out.println(number);


        // random number between 1 and 6 as Double
        num =  random.nextDouble(1,6);
        System.out.println(num);

        // Toss the coin

        coin = random.nextBoolean();

        if(coin){
            System.out.println("Heads");

        }
        else{
            System.out.println("Tails");
        }




    }
}
