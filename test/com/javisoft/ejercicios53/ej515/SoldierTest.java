package com.javisoft.ejercicios53.ej515;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    private final int id = 354654345;
    private final String name = "Bartolo Casas";
    private final String type = "Artillery";
    private final String rank = "Lieutenant Colonel";
    private final GregorianCalendar dateOfRecruitment = new GregorianCalendar(1998, Calendar.NOVEMBER, 6);
    private final double firepower = 666.66;
    private Soldier soldier;

    @BeforeEach
    void setUp() {
        this.soldier = new Soldier(id, name, type, rank, dateOfRecruitment, firepower);
    }

    @Test
    void getId() {
        assertEquals(soldier.getId(), id);
    }

    @Test
    void getName() {
        assertEquals(soldier.getName(), name);
    }

    @Test
    void setName() {
        String newName = "El Fary";
        soldier.setName(newName);
        assertEquals(soldier.getName(), newName);
    }

    @Test
    void getType() {
        assertEquals(soldier.getType(), type);
    }

    @Test
    void setType() {
        String newType = "Designated marksman";
        soldier.setType(newType);
        assertEquals(soldier.getType(), newType);
    }

    @Test
    void getRank() {
        assertEquals(soldier.getRank(), rank);
    }

    @Test
    void setRank() {
        String newRank = "Colonel";
        soldier.setRank(newRank);
        assertEquals(soldier.getRank(), newRank);
    }

    @Test
    void getDateOfRecruitment() {
        assertEquals(soldier.getDateOfRecruitment(), dateOfRecruitment);
    }

    @Test
    void getFirepower() {
        assertEquals(soldier.getFirepower(), firepower);
    }

    @Test
    void setFirepower() {
        double newFP = 420.69;
        soldier.setFirepower(newFP);
        assertEquals(soldier.getFirepower(), newFP);
    }

    @Test
    void toStringTest() {
        String output = "Lieutenant Colonel Bartolo Casas, Artillery. Date of recruitment: " + dateOfRecruitment.toString() + ". Firepower: 666.66";
        assertEquals(soldier.toString(), output);
    }
}