import java.util.Scanner; // Import the Scanner class
public class number5 {
    public static void main(String[] args) {
        String name;
        int age;
        char citizen;
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter your name: ");
        name = scanner.nextLine(); 
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a citizen? (Y/N): ");
        citizen = scanner.next().charAt(0);
          if (citizen == 'Y' && age >= 18 || citizen == 'y' && age  >=18) {
            System.out.println( name + " You are eligible to vote.");
        } else if (citizen == 'Y' && age < 18) {
            System.out.println( name + " You are not eligible to vote. After " + (18 - age) + " years you will be eligible to vote.");
        } else if (citizen == 'N' || citizen == 'n') {
            System.out.println(name + " You are not eligible to vote. you are not a citizen.");
        } else {
            System.out.println(" invalid input.");
        }
            
    }
}
