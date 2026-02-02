import java.util.Scanner;
public class shopping_cart {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        String item;
        double price;
        char currency = '$';
        double total;
        int quantity;

        System.out.print("Enter the item you would like to buy :");
        item = scanner.nextLine();

        System.out.println("Enter the number of item you are buying : ");
        quantity = scanner.nextInt();

        System.out.println("Enter the Price of the Item :");
        price = scanner.nextDouble();

        total = price * quantity;

        System.out.println("Total price for " + item + " is " + total +".\n Thank you for shopping.. " );








    }
}
