// create a car class with barnd model price 
// and display the details  and  5 different objects of car class
// display car whose price is greater than 2000000 use if condition

class Car {
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}
public class mnumber10 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2500000);
        Car car2 = new Car("Honda", "Civic", 1800000);
        Car car3 = new Car("BMW", "X5", 5000000);
        Car car4 = new Car("Audi", "A6", 3000000);
        Car car5 = new Car("Ford", "Mustang", 3500000);

        System.out.println("Cars with price greater than 2000000:");
        if (car1.getPrice() > 2000000) {
            car1.displayDetails();
            System.out.println();
        }
        if (car2.getPrice() > 2000000) {
            car2.displayDetails();
            System.out.println();
        }
        if (car3.getPrice() > 2000000) {
            car3.displayDetails();
            System.out.println();
        }
        if (car4.getPrice() > 2000000) {
            car4.displayDetails();
            System.out.println();
        }
        if (car5.getPrice() > 2000000) {
            car5.displayDetails();
            System.out.println();
        }
    }
}