public class number7 {
    public static void main(String[] args) {
        class Book {
            String title;
            String author;

            Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            void showBook() {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
            }
        }
        Book book1 = new Book("java book", "saumya sir");
        book1.showBook();
    }
}