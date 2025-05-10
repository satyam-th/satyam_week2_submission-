public class number10 {
    public static void main(String[] args) {
         class car_barnd {
            String name;
            String color;
            int price;
            int year;
            
            car_barnd(String name, String color, int price, int year) {
                this.name = name;
                this.color = color;
                this.price = price;
                this.year = year;
            }
        
            
            void showCar() {
                System.out.println("Name: " + name);
                System.out.println("Color: " + color);
                System.out.println("Price: " + price);
                System.out.println("Year: " + year);
            }

    }
        car_barnd car1 = new car_barnd("BMW", "Black", 5000000, 2023);
        car_barnd car2 = new car_barnd("Audi", "White", 6000000, 2024);
        car_barnd car3 = new car_barnd("Mercedes", "Red", 7000000, 2025);
        
        System.out.println("Car 1 Details:");
        car1.showCar();
        
        System.out.println("Car 2 Details:");
        car2.showCar();
        
        System.out.println("Car 3 Details:");
        car3.showCar();
    
}
}
