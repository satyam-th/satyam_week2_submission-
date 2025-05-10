import java.util.Scanner;
public class number9 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number to check negative zero or positive: ");

        int num = scan.nextInt();
        if(num == 0){
            System.out.println("The number is zero.");
        } else if(num < 0){
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }
  }
    
}
