package com.vuta.model;


/**
 * Created by verso_dxr17un on 9/23/2017.
 */
public class UserModel {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private long createdAt;
    private long lastActivity;
    private boolean enabled;
    private int avatar;
    private int role;

    public UserModel() {
        this.name = "";
        this.lastName = "";
        this.email = "";
        this.userName = "";
        this.password = "";
        this.createdAt = 0;
        this.lastActivity = 0;
        this.enabled = true;
        this.avatar = 0;
        this.role = 0;
    }

    public UserModel(int id, String name, String lastName, String email, String userName, String password, long createdAt, long lastActivity, boolean enabled, int avatar, int role) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.createdAt = createdAt;
        this.lastActivity = lastActivity;
        this.enabled = enabled;
        this.avatar = avatar;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", lastActivity=" + lastActivity +
                ", enabled=" + enabled +
                ", avatar=" + avatar +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(long lastActivity) {
        this.lastActivity = lastActivity;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}