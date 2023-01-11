package structural.bridge;

import java.util.List;

public class HtmlFormatter extends Formatter {
    @Override
    public String format(List<Detail> details, String header) {
        StringBuilder builder = new StringBuilder();
        builder.append("this is html\n");
        builder.append(details.get(0).getValue()+":"+details.get(0).getKey());
        return builder.toString();
    }
}
