package com.naman.learning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    
    @Id
    private int aid;
    private String aname;
    private String tech;

    public Alien(){
        
    }

    public Alien(int aid, String aname, String tech) {
        this.aid = aid;
        this.aname = aname;
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getTech() {
        return tech;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + aid;
        result = prime * result + ((aname == null) ? 0 : aname.hashCode());
        result = prime * result + ((tech == null) ? 0 : tech.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
    }

    

    
}
