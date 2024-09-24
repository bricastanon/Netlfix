public class Main {
    public static void main(String[] args) {
        System.out.println("Hello user!");

        // Netflix sign up example:
        String user = "Brianna Castanon";
        String password = "Castanon6";
        String birthDate = "06/28/1999";
        String email = "bricastanon1@gmail.com";
        int watchListCount =15;
        int age = 25;
        char gender = 'F';

        // To change info that is wrong or update^^
        age = 24;
        watchListCount += 1;

        // System.out.print("Hello\n user"); // Escape character (different line)


        //Write Java code that creates variables to represent the following movie details:
        //Movie title (text)
        //Release year (whole number)
        //Movie rating (decimal number, 1-10 scale)
        //Is the movie a favorite? (true/false)
        //Number of reviews (whole number)
        //Director’s name (text)

        String movieTitle = "Interstellar";
        int releaseYear = 2014;
        double movieRating = 10.0;
        boolean favorite = true;
        int totalReviews = 900;
        String directorsName = "Christopher Nolan";

        System.out.println("Hi " + user);
        System.out.println("password: " + password);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Watch List Count: " + watchListCount);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Movie Rating: " + movieRating);
        System.out.println("Favorite?: " + favorite);
        System.out.println("Total Reviews: " + totalReviews);
        System.out.println("Directors Name: " + directorsName);





    }
}