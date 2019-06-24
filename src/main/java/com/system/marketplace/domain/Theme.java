package com.system.marketplace.domain;


public class Theme {

    private int theme_id;
    private String theme_name;
    //Theme 의 세부 항목으로 계속 타고들어가는 동작은 어떻게 처리하지?
    private int user_id;

    public Theme() {}

    public Theme(int theme_id, String theme_name, int user_id) {
        this.theme_id = theme_id;
        this.theme_name = theme_name;
        this.user_id = user_id;
    }

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public String getTheme_name() {
        return theme_name;
    }

    public void setTheme_name(String theme_name) {
        this.theme_name = theme_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "theme_id=" + theme_id +
                ", theme_name='" + theme_name + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
