package com.javisoft.ejercicios53.ej515;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Soldier {

    private final int id;
    private String name;
    private String type;
    private String rank;
    private final GregorianCalendar dateOfRecruitment;
    private double firepower;

    public Soldier(int id, String name, String type, String rank, GregorianCalendar dateOfRecruitment, double firepower) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.rank = rank;
        this.dateOfRecruitment = dateOfRecruitment;
        this.firepower = firepower;
    }

    public int getId() {
        return id;
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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public GregorianCalendar getDateOfRecruitment() {
        return dateOfRecruitment;
    }

    public double getFirepower() {
        return firepower;
    }

    public void setFirepower(double firepower) {
        this.firepower = firepower;
    }

    public String toString() {
        return rank + " " +
                name + ", " + type + ". Date of recruitment: " + dateOfRecruitment.get(Calendar.YEAR) + ". Firepower: " + firepower;
    }
}
