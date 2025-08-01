package com.beamnology.db.db;

public class Beam {
    
    private long id;
    private double beam_length, elastic_modulus, moment_of_inertia;
    private int user_id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getBeam_length() {
        return beam_length;
    }
    public void setBeam_length(double beam_length) {
        this.beam_length = beam_length;
    }
    public double getElastic_modulus() {
        return elastic_modulus;
    }
    public void setElastic_modulus(double elastic_modulus) {
        this.elastic_modulus = elastic_modulus;
    }
    public double getMoment_of_inertia() {
        return moment_of_inertia;
    }
    public void setMoment_of_inertia(double moment_of_inertia) {
        this.moment_of_inertia = moment_of_inertia;
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
}
