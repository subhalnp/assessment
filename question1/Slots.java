package question1;

import java.time.LocalDateTime;

public class Slots {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;

    }
    public LocalDateTime getStartTime() {
        return startTime;

    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;

    }

}
