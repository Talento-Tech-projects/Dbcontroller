package com.beamnology.db.db;

public class PointMoment {
    private long id;
    private double magnitude, position;
    private int beam_id;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getMagnitude() {
        return magnitude;
    }
    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
    public double getPosition() {
        return position;
    }
    public void setPosition(double position) {
        this.position = position;
    }
    public int getBeam_id() {
        return beam_id;
    }
    public void setBeam_id(int beam_id) {
        this.beam_id = beam_id;
    }
    
    
}
