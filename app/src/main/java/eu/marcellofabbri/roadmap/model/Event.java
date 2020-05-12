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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
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
    private String body;
    private String location;

    public Event(OffsetDateTime startTime, OffsetDateTime finishTime, String icon, String body, String location) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.icon = icon;
        this.body = body;
        this.location = location;
    }


}
