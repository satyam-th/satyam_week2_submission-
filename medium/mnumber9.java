class Circle {
    private double radius;
    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Area: " + getArea());
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(10.0);

        System.out.println("Circle 1:");
        circle1.display();
        System.out.println();

        System.out.println("Circle 2:");
        circle2.display();
    }

 }