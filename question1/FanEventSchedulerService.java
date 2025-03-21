package question1;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FanEventSchedulerService {
    //custom slotInterval initialised with value 15 mins.
    public static int configSlotInterval = 15;

    //Taking inputs - available slots and the duration of the event
    public List<LocalDateTime> fanEventScheduler(List<Slots> availableSlots, int eventDuration) {

        List<LocalDateTime> possibleStartTimes = new ArrayList<>();
        for (Slots slot : availableSlots) {
            LocalDateTime startTime = slot.getStartTime();
            LocalDateTime endTime = slot.getEndTime();
            Duration slotDuration = Duration.between(startTime, endTime);
            /*Checking the initial condition for slot eligibility .
            Only if slot is bigger than the event duration it would process further. otherwise moves to next slot.*/
            if(eventDuration > slotDuration.toMinutes()) {
                continue;
            }
            //Checking to see the  slots by incrementing the time.
            while (startTime.plusMinutes(eventDuration).isBefore(endTime) ||
                    startTime.plusMinutes(eventDuration).isEqual(endTime)
            ) {
                possibleStartTimes.add(startTime);
                startTime = startTime.plusMinutes(configSlotInterval);
            }


        }

        return possibleStartTimes;
    }



}
