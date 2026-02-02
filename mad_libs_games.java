import java.util.Scanner;

public class mad_libs_games {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        String adj1;
        System.out.println("Enter an adjective : ");
        adj1 = scanner.nextLine();

        String noun;
        System.out.println("Enter a noun:");
        noun = scanner.nextLine();

        String adj2;
        System.out.println("Enter an adjective:");
        adj2 = scanner.nextLine();

        String verb;
        System.out.println("Enter an verb:");
        verb = scanner.nextLine();

        String adj3;
        System.out.println("Enter an adjective:");
        adj3 = scanner.nextLine();


        System.out.println("Today i want to a " + adj1 +"Zoo.");
        System.out.println("In an exhibit, I saw a " + noun + "." );
        System.out.println( noun + "was" + adj1 + "and" + verb +"!" );
        System.out.println(" I was " + adj3);

        scanner.close();
    }
}
