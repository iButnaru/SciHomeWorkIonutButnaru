package sci.sql.work;

import java.sql.Connection;

public class RoomFair {
    private int id;
    private double value;
    private String season;

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "RoomFair{" +
                "id=" + id +
                ", value=" + value +
                ", season='" + season + '\'' +
                '}';
    }
}
