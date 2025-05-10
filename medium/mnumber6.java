import java.util.Scanner;
class calculateBouns{

    String name;
    double salary;
    int experience;
    
    public calculateBouns(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    
    public void displayBouns() {
        double bouns = 0.0;
        if (experience >= 5) {
            bouns = salary * 0.2;
        } else {
            bouns = salary * 0.1;
        }
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Bouns: " + bouns);
    }

}
public class mnumber6 {
    public static void main(String[] args) {
        System.out.println("Enter the name of Employee:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter the salary of Employee:");
        double salary = sc.nextDouble();
        System.out.println("Enter the experience of Employee in years:");
        int experience = sc.nextInt();

        calculateBouns emp1 = new calculateBouns(name, salary, experience);
        emp1.displayBouns();
    }
}
