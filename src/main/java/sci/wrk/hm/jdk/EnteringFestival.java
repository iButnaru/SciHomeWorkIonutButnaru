package sci.wrk.hm.jdk;

import java.util.concurrent.TimeUnit;

/**
 * @author Ionut Butnaru
 * @version 1.0
 * @see FestivalGate
 * @see FestivalAttendeeThread
 * @see FestivalStatistics
 * @see TicketType
 */

public class EnteringFestival {

    public static void main(String[] args) {

        FestivalGate gate = new FestivalGate();

        for (int j = 0; j < 50; j++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!gate.getMyGate().isEmpty() && j % 5 == 0) {
                FestivalStatistics statistics = new FestivalStatistics(gate);
                statistics.start();
                System.out.println(statistics);
            } else {
                FestivalAttendeeThread t = new FestivalAttendeeThread(gate, TicketType.getRandomTicket());
                t.start();
            }
        }
    }
}

