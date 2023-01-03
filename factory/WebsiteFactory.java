package factory;

public class WebsiteFactory {
  public Website createWebsite(WebsiteType siteType){
    switch (siteType) {
      case BLOG:
        return new Blog();
      case SHOP:
        return new Shop();
      default:
        return null;
    }
  }
}
