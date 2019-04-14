package sci.wrk.hm.jdk;

/**
 * @author Ionut Butnaru
 * @version 1.0
 * @see FestivalGate
 * @see FestivalStatistics
 * @see EnteringFestival
 */

public class FestivalAttendeeThread extends Thread {
    TicketType ticket;
    FestivalGate gate;

    public FestivalAttendeeThread(FestivalGate gate, TicketType ticket) {
        this.ticket = ticket;
        this.gate = gate;
    }

    @Override
    public void run() {
        if (ticket != null) {
            gate.addTickets(ticket);
        }
    }
}
