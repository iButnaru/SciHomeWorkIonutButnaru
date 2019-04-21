package sci.sql.work;

import java.sql.*;

public class Acommodation {

    private int id;
    private String type;
    private String bed_type;
    private int max_guets;
    private String description;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public int getMax_guets() {
        return max_guets;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Acommodation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", bed_type='" + bed_type + '\'' +
                ", max_guets=" + max_guets +
                ", description='" + description + '\'' +
                '}';
    }
}
