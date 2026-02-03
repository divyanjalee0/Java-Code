import java.sql.SQLOutput;
import java.util.Scanner;
public class if_else {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter you name : ");
        name = scanner.nextLine();

        System.out.println("Enter you age : ");
        age = scanner.nextInt();

        System.out.println("Enter if you are a Student(true/false) : ");
        isStudent = scanner.nextBoolean();

        //Group 1

        if(name.isEmpty()){
            System.out.println("You havn't entered your name : ");

        }
        else {
            System.out.println(" Your name is " + name + " Hello! ");
        }


        //Group 2

        if ( age > 65) {
            System.out.println("You are a Senior");
        }
        else if ( age >= 18){
            System.out.println("You are an Adult");
        }
        else if ( age >= 13){
            System.out.println("you are a Child");
        }

        //Group 3

        if(isStudent){
            System.out.println("You are a Student 😊");
        }
        else {
            System.out.println("YOU ARE NOT A STUDENT 😒");
        }
        scanner.close();
    }

}
