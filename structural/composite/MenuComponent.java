package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    private String url;
    private String name;

    public MenuComponent(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String print(){
        return this.name+": "+ this.url + "\n";
    }

}
