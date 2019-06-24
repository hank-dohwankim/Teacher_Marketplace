package com.system.marketplace.domain;


import lombok.Data;

@Data
public class Proposal {

    private int proposal_id;
    private int user_id;
    private String theme_id;
    private String proposal_subject;
    private String proposal_dec;
    private String proposal_start;
    private String proposal_end;
    private float proposal_wage_hour;
    private float proposal_wage_day;
    private float proposal_amount_offer;

    public Proposal() {}

    public Proposal(int proposal_id, int user_id, String theme_id, String proposal_subject, String proposal_dec, String proposal_start, String proposal_end, float proposal_wage_hour, float proposal_wage_day, float proposal_amount_offer) {
        this.proposal_id = proposal_id;
        this.user_id = user_id;
        this.theme_id = theme_id;
        this.proposal_subject = proposal_subject;
        this.proposal_dec = proposal_dec;
        this.proposal_start = proposal_start;
        this.proposal_end = proposal_end;
        this.proposal_wage_hour = proposal_wage_hour;
        this.proposal_wage_day = proposal_wage_day;
        this.proposal_amount_offer = proposal_amount_offer;
    }

    public int getProposal_id() {
        return proposal_id;
    }

    public void setProposal_id(int proposal_id) {
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

    public String getProposal_subject() {
        return proposal_subject;
    }

    public void setProposal_subject(String proposal_subject) {
        this.proposal_subject = proposal_subject;
    }

    public String getProposal_dec() {
        return proposal_dec;
    }

    public void setProposal_dec(String proposal_dec) {
        this.proposal_dec = proposal_dec;
    }

    public String getProposal_start() {
        return proposal_start;
    }

    public void setProposal_start(String proposal_start) {
        this.proposal_start = proposal_start;
    }

    public String getProposal_end() {
        return proposal_end;
    }

    public void setProposal_end(String proposal_end) {
        this.proposal_end = proposal_end;
    }

    public float getProposal_wage_hour() {
        return proposal_wage_hour;
    }

    public void setProposal_wage_hour(float proposal_wage_hour) {
        this.proposal_wage_hour = proposal_wage_hour;
    }

    public float getProposal_wage_day() {
        return proposal_wage_day;
    }

    public void setProposal_wage_day(float proposal_wage_day) {
        this.proposal_wage_day = proposal_wage_day;
    }

    public float getProposal_amount_offer() {
        return proposal_amount_offer;
    }

    public void setProposal_amount_offer(float proposal_amount_offer) {
        this.proposal_amount_offer = proposal_amount_offer;
    }
}

