package sci.wrk.hm.jdk;

/**
 * @author Ionut Butnaru
 * @version 1.0
 * @see FestivalGate
 * @see TicketType
 * @see EnteringFestival
 * <p>
 * {@link FestivalStatistics} takes as a parameter a list {@link FestivalGate},
 * iterates through it and every time a type of {@link TicketType} is found,
 * an integer assigned to that type, is incremented with 1, all these in the overriden method from {@link Thread}.
 */

public class FestivalStatistics extends Thread {

    private static int fullVipCount;
    private static int oneDayVipCount;
    private static int fullCount;
    private static int oneDayPassCount;
    private static int freePassCount;
    FestivalGate gate;

    public FestivalStatistics(FestivalGate gate) {
        this.gate = gate;
    }

    public int getFullVipCount() {
        return fullVipCount;
    }

    public int getOneDayVipCount() {
        return oneDayVipCount;
    }

    public int getFullCount() {
        return fullCount;
    }

    public int getOneDayPassCount() {
        return oneDayPassCount;
    }

    public int getFreePassCount() {
        return freePassCount;
    }

    @Override
    public void run() {

        for (TicketType gat : gate.getMyGate()) {

            switch (gat) {
                case Full_Vip:
                    fullVipCount++;
                    break;
                case One_Day_Vip:
                    oneDayVipCount++;
                    break;
                case Full:
                    fullCount++;
                    break;
                case One_Day_Pass:
                    oneDayPassCount++;
                    break;
                case Free_Pass:
                    freePassCount++;
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return " FestivalStatistics{" +
                (fullCount + fullVipCount + freePassCount + oneDayPassCount + oneDayVipCount) +
                " People Entered: " +
                " Full Vip Tickets = " + getFullVipCount() +
                " Full Tickets = " + getFullCount() +
                " One Day Vip Tickets = " + getOneDayVipCount() +
                " One Day Pass Tickets = " + getOneDayPassCount() +
                " Free Pass Tickets = " + getFreePassCount() + "}";
    }
}
