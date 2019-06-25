package com.system.marketplace.domain;

public class Project {
    private int theme_id;
    private String subject;
    private String subject_detail;
    private String category;
    private String internal_order_id;
    private String lecture_period;
    private String lecture_wage;
    private String lecture_wage_range;
    private String address;

    public Project() {}

    public Project(int theme_id, String subject, String subject_detail, String category, String internal_order_id, String lecture_period, String lecture_wage, String lecture_wage_range, String address) {
        this.theme_id = theme_id;
        this.subject = subject;
        this.subject_detail = subject_detail;
        this.category = category;
        this.internal_order_id = internal_order_id;
        this.lecture_period = lecture_period;
        this.lecture_wage = lecture_wage;
        this.lecture_wage_range = lecture_wage_range;
        this.address = address;
    }

    public int getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(int theme_id) {
        this.theme_id = theme_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject_detail() {
        return subject_detail;
    }

    public void setSubject_detail(String subject_detail) {
        this.subject_detail = subject_detail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getInternel_order_id() {
        return internal_order_id;
    }

    public void setInternel_order_id(String internal_order_id) {
        this.internal_order_id = internal_order_id;
    }

    public String getLecture_period() {
        return lecture_period;
    }

    public void setLecture_period(String lecture_period) {
        this.lecture_period = lecture_period;
    }

    public String getLecture_wage() {
        return lecture_wage;
    }

    public void setLecture_wage(String lecture_wage) {
        this.lecture_wage = lecture_wage;
    }

    public String getLecture_wage_range() {
        return lecture_wage_range;
    }

    public void setLecture_wage_range(String lecture_wage_range) {
        this.lecture_wage_range = lecture_wage_range;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
