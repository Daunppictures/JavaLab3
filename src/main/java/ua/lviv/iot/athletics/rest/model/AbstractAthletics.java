package ua.lviv.iot.athletics.rest.model;

public abstract class AbstractAthletics {

    protected int stageDuration;

    protected int numberOfParticipants;

    protected int numberOfRepeat;

    protected int distanceInMeters;

    protected Integer id;

    public AbstractAthletics(int distanceInMeters) {
        super();
        this.distanceInMeters = distanceInMeters;
    }

    public int getStageDuration() {
        return stageDuration;
    }

    public void setStageDuration(int stageDuration) {
        this.stageDuration = stageDuration;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getDistanceInMeters() {
        return distanceInMeters;
    }

    public void setDistanceInMeters(int distanceInMeters) {
        this.distanceInMeters = distanceInMeters;
    }

    public int getNumberOfRepeat() {
        return numberOfRepeat;
    }

    public void setNumberOfRepeat(int numberOfRepeat) {
        this.numberOfRepeat = numberOfRepeat;
    }

    public String getHeaders() {
        return "stageDuration, numberOfParticipants, numberOfRepeat, distanceInMeters";
    }

    public String toCSV() {
        return getStageDuration() + ", " + getNumberOfParticipants() + ", " + getNumberOfRepeat()
                + ", " + getDistanceInMeters();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public AbstractAthletics() {
        
    }

}