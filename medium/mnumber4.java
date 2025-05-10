class calculatearea{
    int length;
    int breadth;
    int area;
    void setLength(int l){
        length=l;
    }
    void setBreadth(int b){
        breadth=b;
    }
    void calculateArea(){
        area=length*breadth;
    }
    void displayArea(){
        System.out.println("Area of rectangle is: "+area);
    }



}


public class mnumber4 {
    public static void main(String[] args) {
        calculatearea obj = new calculatearea();
        obj.setLength(5);
        obj.setBreadth(10);
        obj.calculateArea();
        obj.displayArea();
    }

    
}
