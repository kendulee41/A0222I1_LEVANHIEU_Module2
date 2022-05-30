package _4_class_object.excercise.e2;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        startTime = new Date();
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
