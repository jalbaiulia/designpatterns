package creational.prototype;

public class PrototypeDemo {

  public static void main(String[] args) {
    Records records = new Records();
    Movie movie = (Movie) records.createItem("movie");

    movie.setTitle("Jack Ryan");

    System.out.println(movie);

    Movie movie2 = (Movie) records.createItem("movie");

    movie2.setTitle("how to get away with murder");

    System.out.println(movie.toString() + movie2);

  }

}
