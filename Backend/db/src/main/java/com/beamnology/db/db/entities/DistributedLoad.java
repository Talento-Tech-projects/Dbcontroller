package com.beamnology.db.db.entities;

public class DistributedLoad {
    private long id;
    private double start_magnitude, end_magnitude, start_position, end_position;
    private int beam_id;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getStart_magnitude() {
        return start_magnitude;
    }
    public void setStart_magnitude(double start_magnitude) {
        this.start_magnitude = start_magnitude;
    }
    public double getEnd_magnitude() {
        return end_magnitude;
    }
    public void setEnd_magnitude(double end_magnitude) {
        this.end_magnitude = end_magnitude;
    }
    public double getStart_position() {
        return start_position;
    }
    public void setStart_position(double start_position) {
        this.start_position = start_position;
    }
    public double getEnd_position() {
        return end_position;
    }
    public void setEnd_position(double end_position) {
        this.end_position = end_position;
    }
    public int getBeam_id() {
        return beam_id;
    }
    public void setBeam_id(int beam_id) {
        this.beam_id = beam_id;
    }
    
    
}
