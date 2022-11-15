import java.util.ArrayList;

public class CheckMeetingTimes {

    /**
     * Checking if new meeting time overlaps with meetings already scheduled.
     * @param list
     * @param time
     * @return true or false
     */
    public boolean CheckMeetingTimes(ArrayList<String> list, String time) {
        if (list.contains(time)) {
            System.out.println("Participant already has a meeting scheduled at this time.");
            return false;
        } else {
            list.add(time);
            System.out.println("Meeting at " + time + " has been added to this participants schedule. The participant will review this and either accept or decline");
            return true;
        }
    }



}
