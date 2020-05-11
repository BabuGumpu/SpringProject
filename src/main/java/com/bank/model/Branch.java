package com.bank.model;/*
 *
 * @project - SpringProject
 * @author - Babu Gumpu , on 11/05/2020
 *
 */

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BRANCH_ID")
    private String identification;
    @Column(name = "SEQUENCE_NUMBER")
    private String sequenceNumber;
    @Column(name = "BRANCH_NAME")
    private String name;
    @Column(name = "BRANCH_TYPE")
    private String type;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
