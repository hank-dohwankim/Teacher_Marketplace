package com.system.marketplace.domain;


import lombok.Data;

@Data
public class Project {

    private int project_id;
    private int proposal_id;
    private int user_id;
    private String theme_id;
    private String project_subject;
    private String project_requirement;
    private String project_dec;
    private String project_start;
    private String project_end;
    private float wage_hour;
    private float wage_day;
    private float amount_offer;

    public Project() {}

    public Project(int project_id, int proposal_id, int user_id, String theme_id, String project_subject, String project_dec, String project_start, String project_end, float wage_hour, float wage_day, float amount_offer) {
        this.project_id = project_id;
        this.proposal_id = proposal_id;
        this.user_id = user_id;
        this.theme_id = theme_id;
        this.project_subject = project_subject;
        this.project_dec = project_dec;
        this.project_start = project_start;
        this.project_end = project_end;
        this.wage_hour = wage_hour;
        this.wage_day = wage_day;
        this.amount_offer = amount_offer;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getProject_detail_id() {
        return proposal_id;
    }

    public void setProject_detail_id(int proposal_id) {
        this.proposal_id = proposal_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(String theme_id) {
        this.theme_id = theme_id;
    }

    public String getProject_name() {
        return project_subject;
    }

    public void setProject_name(String project_subject) {
        this.project_subject = project_subject;
    }

    public String getProject_dec() {
        return project_dec;
    }

    public void setProject_dec(String project_dec) {
        this.project_dec = project_dec;
    }

    public String getProject_start() {
        return project_start;
    }

    public void setProject_start(String project_start) {
        this.project_start = project_start;
    }

    public String getProject_end() {
        return project_end;
    }

    public void setProject_end(String project_end) {
        this.project_end = project_end;
    }

    public float getWage_hour() {
        return wage_hour;
    }

    public void setWage_hour(float wage_hour) {
        this.wage_hour = wage_hour;
    }

    public float getWage_day() {
        return wage_day;
    }

    public void setWage_day(float wage_day) {
        this.wage_day = wage_day;
    }

    public float getAmount_offer() {
        return amount_offer;
    }

    public void setAmount_offer(float amount_offer) {
        this.amount_offer = amount_offer;
    }
}

