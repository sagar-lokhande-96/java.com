import java.util.Scanner;
public class varAndDataTypesAndInputes {
    public static void Inputs(){
        try (// Scanner class used to take inputs from the user
        Scanner sc = new Scanner(System.in)) {
            // Integer
            System.out.println("Enter the Integer value (10): ");
            int n = sc.nextInt();

            // Byte & boolean
            System.out.println("Enter the Byte value (20): ");
            byte y1 = sc.nextByte();
            System.out.println("Enter the boolean value (true) : ");
            boolean y2 = sc.nextBoolean();

            // Float & Double
            System.out.println("Enter the float value (4.6): ");
            float b1 = sc.nextFloat();
            System.out.println("Enter the double value (34564.84674): ");
            Double b2 = sc.nextDouble();

            // Short & long 
            System.out.println("Enter the short value (474): ");
            short s1 = sc.nextShort();
            System.out.println("Enter the long value (476356437538): ");
            long s2 = sc.nextLong();

            // String
            System.out.println("Enter the string 1 value (hello): ");
            String t1 = sc.next();   // for a word (String)

            System.out.println("Enter the string value (this is java program): ");
            String t2 = sc.nextLine();  // for more than a word


            // Printing the values
            System.out.print("The Integer value is : " + n);
            System.out.print("The Byte value is : " + y1);
            System.out.print("The boolean value is : " + y2);
            System.out.print("The float value is : " + b1);
            System.out.print("The double value is : " + b2);
            System.out.print("The short value is : " + s1);
            System.out.print("The Long value is : "+ s2);
            System.out.print("The short String value is : "+ t1);
            System.out.print("The long String value is : "+ t2);

        }

    }
    public static void main(String aerg[]){
        /* Variables Rules:
            Containers for storing values 
            created when a value is assigned to it.
            case-sensitive.
            only contain letters, numbers, or underscores.
            start with a letter or an underscore.
            cannot start with a number.
            cannot be a reserved keyword. like int,float
            V.names cannot contain spaces and special characters
        */
        
        int a = 5;
        int b = 10;
        int c = 2*(a+b); // 2 is an literals 
        System.out.println(c);


        // Data Types:
        //1.Primitive Data Types:
           /*
           a. int: 4 bytes 
           b. float: 4 bytes
           c. double: 8 bytes
           d. char: 2 bytes
           e. boolean: 1 byte
           f. byte: 1 byte
           g. short: 2 bytes
           h. long: 8 bytes   
           */

        // 2. Non-Primitive Data Types:
            /*
            a. String: 2 bytes
            b. Array: 2 bytes
            c. Class: 2 bytes
            d. Interface: 2 bytes
            e. Object: 2 bytes
            */
        
        
        Inputs();
    }
}
