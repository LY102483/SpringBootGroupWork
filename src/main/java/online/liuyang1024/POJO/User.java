package online.liuyang1024.POJO;

import java.util.List;

/**
 * Create by LiuYang on 2022/5/29 18:03
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private List<Role> roles;

    public User() {
    }

    private String phoneNum;
    private String picture;

    public User(int id, String username, String password, String email, List<Role> roles, String phoneNum, String picture) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
        this.phoneNum = phoneNum;
        this.picture = picture;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", phoneNum='" + phoneNum + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
