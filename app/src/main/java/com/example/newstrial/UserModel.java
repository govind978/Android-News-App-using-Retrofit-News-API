package com.example.newstrial;

public class UserModel {
    String profilePic, username, email, password, userId;

    public String getProfilePic() {
        return profilePic;
    }

    public UserModel() {
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserModel(String profilePic, String username, String email, String password, String userId) {
        this.profilePic = profilePic;
        this.username = username;
        this.email = email;
        this.password = password;
        this.userId = userId;
    }
}
