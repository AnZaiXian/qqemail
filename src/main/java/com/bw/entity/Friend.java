package com.bw.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by lenovo on 2017/7/11.
 */
@Entity
public class Friend implements Serializable{
    @Id
    @GeneratedValue//(generator = "Generator")
   // @GenericGenerator(name = "Generator", strategy = "uuid")
   // private String id;
    private Integer id;
    private String uname;
    private  String pwd;
    private String email;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Friend(String uname, String pwd, String email, String phone) {
        this.uname = uname;
        this.pwd = pwd;
        this.email = email;
        this.phone = phone;
    }

    public Friend(){super();}

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
