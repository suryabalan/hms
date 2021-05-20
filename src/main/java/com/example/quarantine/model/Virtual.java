package com.example.quarantine.model;

import javax.persistence.*;

@Entity
@Table(name = "docname")
public class Virtual {
    @Id
    

    @Column(name = "Pname")
    private String Pname;
    @Column(name = "Hid")
    private int Hid;

    @Column(name = "Age")
    private int Age;

    @Column(name = "Gender")
    private String Gender;

    @Column(name = "Dates")
    private String Date;
    @Column(name = "Times")
    private String Time;
    @Column(name = "Dname")
    private String Dname;
    @Column(name = "Problem")
    private String Problem;

    public Virtual(){

    }

    public Virtual( String Pname,int Hid, int Age, String Gender, String Date, String Time, String Dname, String Problem) {
        
        
        this.Pname = Pname;
        this.Hid = Hid;
        this.Age = Age;
        this.Gender = Gender;
        this.Date = Date;
        this.Time = Time;
        this.Dname = Dname;
        this.Problem = Problem;
    }

    


    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }
    
    public int getHid() {
        return Hid;
    }

    public void setHid(int Hid) {
        this.Hid = Hid;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }
    public String getProblem() {
        return Problem;
    }

    public void setProblem(String Problem) {
        this.Problem = Problem;
    }
}

