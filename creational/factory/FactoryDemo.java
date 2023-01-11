package creational.factory;

import java.util.Calendar;

public class FactoryDemo {

  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal);
    /////////////////////////////////////

    WebsiteFactory factory = new WebsiteFactory();
    Blog blog = (Blog) factory.createWebsite(WebsiteType.BLOG);


  }

}
