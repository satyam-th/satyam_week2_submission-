import java.util.Scanner; // Import the Scanner class
public class number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the  number  to check if it is even or odd: ");
        int number = scanner.nextInt(); 
      if (number == 0 ) {
        System.out.println("The number is zero.");
        
      } 
      else if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close(); 

    }
}    
