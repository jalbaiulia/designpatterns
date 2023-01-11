package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Records {

  public Map<String, Item> records = new HashMap();

  public Records() {
    initRecords();
  }

  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item) (records.get(type)).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return item;

  }


  public void initRecords() {
    Movie movie = new Movie();
    movie.setRuntime("123");
    movie.setPrice(12.32);
    movie.setTitle("Joker");
    movie.setUrl("www.home.com");

    records.put("movie", movie);

    Book book = new Book();
    book.setPrice(43.2);
    book.setUrl("www.book.com");
    book.setNumberOfPages(2322);
    book.setTitle("best book");

    records.put("book", book);
  }


}
