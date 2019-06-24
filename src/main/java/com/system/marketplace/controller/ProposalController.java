package com.system.marketplace.controller;

import com.system.marketplace.domain.Project;
import com.system.marketplace.domain.Proposal;

import java.util.List;

//@Data
public class ProposalController extends Project {

    private List<Proposal> proposal;

    public List<Proposal> getProposal() {
        return proposal;
    }

    public void setProposal(List<Proposal> proposal) {
        this.proposal = proposal;
    }

    @Override
    public String toString() {
        return "OrderRequestVO{" +
                "proposal=" + proposal +
                '}';
    }
}
