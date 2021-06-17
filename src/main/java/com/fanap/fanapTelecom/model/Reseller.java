package com.fanap.fanapTelecom.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("reseller")
public class Reseller extends User {

    private String code;
    private Integer commission;

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {

        return "Reseller [code=" + code + ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getName()=" + getName() + "]";
    }
}
