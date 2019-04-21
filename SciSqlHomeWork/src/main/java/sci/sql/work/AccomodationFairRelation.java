package sci.sql.work;

import java.sql.Connection;

public class AccomodationFairRelation {
    private int id;
    private int id_accomodation;
    private int id_room_fair;


    public int getId() {
        return id;
    }

    public int getId_accomodation() {
        return id_accomodation;
    }

    public int getId_room_fair() {
        return id_room_fair;
    }

    @Override
    public String toString() {
        return "AccomodationFairRelation{" +
                "id=" + id +
                ", id_accomodation=" + id_accomodation +
                ", id_room_fair=" + id_room_fair +
                '}';
    }
}
