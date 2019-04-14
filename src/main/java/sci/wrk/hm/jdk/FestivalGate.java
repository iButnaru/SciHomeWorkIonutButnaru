package sci.wrk.hm.jdk;


import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Ionut Butnaru
 * @version 1.0
 * @see TicketType
 * @see EnteringFestival
 */

public class FestivalGate {

    CopyOnWriteArrayList<TicketType> myGate;


    public FestivalGate() {
        myGate = new CopyOnWriteArrayList<TicketType>();
    }

    /**
     * Add and item from enum {@link TicketType} to a list.
     * @param ticket of type {@link TicketType}.
     */
    public void addTickets(TicketType ticket) {
        if (ticket != null) {
            myGate.add(ticket);
        }
    }


    /**
     * Gets the {@link CopyOnWriteArrayList}
     */
    public CopyOnWriteArrayList<TicketType> getMyGate() {
        return myGate;
    }

    @Override
    public String toString() {
        return "FestivalGate{" +
                "myGate=" + myGate +
                '}';
    }
}
