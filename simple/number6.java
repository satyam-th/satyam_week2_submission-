import java.util.Scanner; // Import the Scanner class
public class number6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number : "); 
        int num2 = scan.nextInt();
        if(num1 == num2) {
            System.out.println("Both numbers are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }
        
    }


}
