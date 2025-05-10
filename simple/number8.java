import java.util.Scanner;
public class number8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter the operation '+' '*' '-' and '/': ");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println("The sum is: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("The difference is: " + (num1 - num2));
        } else if (operation == '*') { 
            System.out.println("The product is: " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 != 0) {
                System.out.println("The quotient is: " + (num1 / num2));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operation.");
        }
        scan.close();
    }
}
