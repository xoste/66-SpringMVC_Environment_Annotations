package com.xoste.leon.pojo;

/**
 * @author Leon
 */
public class Demo {
    private User user;

    public Demo() {
    }

    public Demo(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "user=" + user +
                '}';
    }
}
