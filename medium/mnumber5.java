class moviedetails {
    String name;
    String language;
    double rating;

    public moviedetails(String name, String language, double rating) {
        this.name = name;
        this.language = language;
        this.rating = rating;
    }

    public void displayMovieDetails() {
        System.out.println("Movie Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Rating: " + rating);
    }
}

public class mnumber5{
    public static void main(String[] args) {
        moviedetails movie1 = new moviedetails("Kagaz Patra", "Nepali", 4.5);
        moviedetails movie2 = new moviedetails("Shree 5 Ambare", "Nepali", 4.0);
        moviedetails movie3 = new moviedetails("Chhakka Panja", "Nepali", 4.2);
        moviedetails movie4 = new moviedetails("Khadar", "Nepali", 3.8);

        movie1.displayMovieDetails();
        movie2.displayMovieDetails();
        movie3.displayMovieDetails();
        movie4.displayMovieDetails();
    }
}
