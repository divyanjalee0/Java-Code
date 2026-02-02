public class arthematic_oper {
    public static void main(){

        int X = 10;
        int Y = 3;
        int Z;
        System.out.println("Arithmetic operators");
// Arithmetic operators
        Z = X + Y;
        System.out.println(Z);
        Z = X - Y;
        System.out.println(Z);
        Z = X % Y;
        System.out.println(Z);
        Z = X / Y;
        System.out.println(Z);
        Z = X * Y;
        System.out.println(Z);

System.out.print("This is an Augmented assigment operators");
        //Augmented assigment operators

        int  a = 10;
        int b = 3;

        a += b;
        System.out.println(a);
        a -= b;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        a /= b;
        System.out.println(a);
        a %= b;
        System.out.println(a);

System.out.println("Increment and Decrement Operators ");
        // increment and decrement operators;

        a++;
        System.out.println(a);
        a--;
        System.out.println(a);


// Order of Operations [ P - E - M - D - A - S ]
System.out.println("Order of Operations");
        double result = 2 +  3 *  (10%2);
        System.out.println(result);
    }
}
