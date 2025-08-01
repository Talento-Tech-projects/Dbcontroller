package com.beamnology.db.db.dto;

public class UserDTO {

    private long id; 
    private String user_name, email; 
    private int phone_number;
    
    public UserDTO() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    
    
}
