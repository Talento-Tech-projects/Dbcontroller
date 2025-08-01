package com.beamnology.db.db.entities;

public class Support {
    private long id;
    private String type;
    private double position;
    private int beam_id;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
