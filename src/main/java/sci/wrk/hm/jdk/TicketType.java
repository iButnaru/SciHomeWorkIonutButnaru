package sci.wrk.hm.jdk;

import java.util.Random;

/**
 * @author Ionut Butnaru
 * @version 1.0
 * @see FestivalGate
 * @see FestivalAttendeeThread
 * @see FestivalStatistics
 * @see EnteringFestival
 *
 * Enum class containing 5 types of tickets.
 */

public enum TicketType {

    Full_Vip,
    One_Day_Vip,
    Full,
    One_Day_Pass,
    Free_Pass;

    private static final TicketType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    /**
     * Method which returns a random ticket of type {@link TicketType}
     */

    public static TicketType getRandomTicket() {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
