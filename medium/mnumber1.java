class Book {
    String title;
    String author;
    int ISBN;
    int price;
        Book(String title, String author, int ISBN, int price) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.price = price;
        }
        void showBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
            System.out.println("Price: " + price);
        } 

}
public class mnumber1 {
    
    public static void main(String[] args) {

    
        Book book1 = new Book("java book", "saumya sir", 123, 500);
        Book book2 = new Book("c book", "ram sir", 7892, 600);
        Book book3 = new Book("be a hiro", "kirshna_hero", 345, 700);
        Book book4 = new Book("be a handsome", "sandesh handsome", 745, 2200);
        Book book5 = new Book("be a smart", "aashish smart", 456, 800);
        
        System.out.println("Book 1 Details:");
        book1.showBook();
        
        System.out.println("Book 2 Details:");
        book2.showBook();
        
        System.out.println("Book 3 Details:");
        book3.showBook();
        
        System.out.println("Book 4 Details:");
        book4.showBook();

        System.out.println("Book 5 Details:");
        book5.showBook();
}
}