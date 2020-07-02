package ua.lviv.iot.athletics.rest.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractAthletics {
    @Column
    protected int stageDuration;
    
    @Column
    protected int numberOfParticipants;
    
    @Column
    protected int numberOfRepeat;
    
    @Column
    protected int distanceInMeters;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

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