public class number4 {
class Student {
    String name;
    int age;

    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    

    public static void main(String[] args) {
        Student student1 = new Student("satyam", 20);
        Student student2 = new Student("dipson", 22);
    
        student1.displayInfo();
        student2.displayInfo();
    }
}
}