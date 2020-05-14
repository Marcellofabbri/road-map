package eu.marcellofabbri.roadmap.model;

import java.time.OffsetDateTime;

public class Event {
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public OffsetDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(OffsetDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private OffsetDateTime startTime;
    private OffsetDateTime finishTime;
    private String icon;
    private String title;
    private String location;

    public Event(OffsetDateTime startTime, OffsetDateTime finishTime, String icon, String title, String location) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.icon = icon;
        this.title = title;
        this.location = location;
    }


}
