package com.theatre.dto;
public class User {
    private int userID;
    private String username;
    private String password;
    private String email;
    private boolean isadmin;

    public User(int userID, String username, String password, String email, boolean isadmin) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isadmin = isadmin;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }
}
