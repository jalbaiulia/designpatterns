package structural.bridge;

public class Main
{
    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.setClassifier("action");
        movie.setTitle("filmProst");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(printFormatter));

        Formatter htmlFormatter = new HtmlFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));


    }
}
