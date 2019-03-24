package models;

//  Model which we will use to work with user
public class User {
    private String username;
    private String password;

//    Empty constructor
    public User() {
    }

//    Full constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

//    Method toString allows you write your object in String
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

//    Getters and setters
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
}
