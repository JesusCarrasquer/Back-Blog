package com.Jesus.Blog.entity;

import javax.persistence.*;

@Entity
@Table(name = "AllowedIps")
public class AllowedIps {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String ip;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        AllowedIps ips = (AllowedIps) obj;
        return ip.equals(ips.ip);
    }
}
