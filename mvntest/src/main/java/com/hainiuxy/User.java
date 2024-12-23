package com.hainiuxy;

/**
 * ClassName: User
 * Package: com.hainiuxy
 * Description:
 *
 * @Author 邱籽健
 * @Create 2024/11/23 17:54
 * @Version 1.0
 */
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
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
}
