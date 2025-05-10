import java.util.Scanner;
class StudentGrade {
    String name;
    double marks;
    String grade;

    public StudentGrade(String name, int rollNumber, double marks) {
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
    }

    private String calculateGrade(double marks) {
        switch ((int) marks / 10) {
            case 10:
            case 9:
                return "A+";
            case 8:
                return "A";
            case 7:
                return "B+";
            case 6:
                return "B";
            case 5:
                return "C+";
            case 4:
                return "C";
            default:
                return "F";
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}


public class mnumber3 {

    
    public static void main(String[] args) {
        StudentGrade student1 = new StudentGrade("Aashish Smart", 123456, 90.0);
        StudentGrade student2 = new StudentGrade("Sandesh Hiro", 654321, 80.0);
        StudentGrade student3 = new StudentGrade("Saumya Sir", 789012, 70.0);

        // Array of students
        StudentGrade[] students = {student1, student2, student3};

        for (StudentGrade student : students) {
            student.display();
        }
    }
}
