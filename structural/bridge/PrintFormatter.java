package structural.bridge;

import java.util.List;

public class PrintFormatter extends Formatter {
    @Override
    public String format(List<Detail> details, String header) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");
        for (Detail d : details) {
            builder.append(d.getKey());
            builder.append(":");
            builder.append(d.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
