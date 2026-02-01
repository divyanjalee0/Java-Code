import java.util.Scanner;


public class inpute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your GPA:");
        double GPA = scanner.nextDouble();
        boolean  Pass = true;

        if(GPA>=6){
            System.out.println("You are Pass with GPA " + GPA);
        }
        else {
            System.out.println("You are Fail!!!");


            System.out.println("you are " + age + " years old");
            System.out.println("Hello!" + name);
            System.out.println("your GPA is : " + GPA);

        }
                scanner.close();

    }
}
