public class Operators {
    @SuppressWarnings("unused")
    public static void firstFiveOperators(){
        System.out.println("1. In this method 5 operators are explained here");
        // Arithmatic 
            // Binary (+, -, /, %, *)  -> used 2 operand for performing an operation
            // Unary (++, --)  -> used only 1 operand 
            int a = 1;
            a++;

        // Relational 
            // (==, !=, >, <, <=, >=)

        // Logical 
            // (&&, ||, !)

        // Assignment
            // (=, +=, -=, *=, /=)

        
    }

    public static void ternary() {
        System.out.println("\n2. Ternary Operator");
        int a = 8;
        int b = 5;
        // variable = condition ? statement1(true) : statement2(if false)
        int larger = (a > b) ? a : b;
        System.out.print("\tThis is the larger number in this both : " + larger);
    }

    public static void main(String arg[]) {
        // Their are 6 types of operators in java 
        //     1. Arithmatic
        //     2. Relational
        //     3. Logical 
        //     4. Bitwise
        //     5. Assignment
        //     6. Ternary
        firstFiveOperators();
        ternary();
    }
}
