
class productdetails {
    String name;
    double price;
    double discountPercentage;

    public productdetails(String name, double price, double discountPercentage) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Final Price after Discount: " + calculateFinalPrice());
    }
}
public class mnumber7 {
    public static void main(String[] args) {
        productdetails product1 = new productdetails("Laptop", 80000, 10);
        productdetails product2 = new productdetails("Smartphone", 50000, 15);
        productdetails product3 = new productdetails("Headphones", 2000, 5);
        productdetails product4 = new productdetails("Smartwatch", 15000, 20);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
        System.out.println();
        product3.displayProductDetails();
        System.out.println();
        product4.displayProductDetails();
    }
}

