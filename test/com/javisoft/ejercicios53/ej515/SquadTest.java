package com.javisoft.ejercicios53.ej515;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    private Squad squad;
    private final int id1 = 420;
    private final int id2 = 69;
    private final String name1 = "Paco";
    private final String name2 = "Manolo";
    private final String type1 = "Sniper";
    private final String type2 = "Grenadier";
    private final String rank1 = "Private";
    private final String rank2 = "Supreme Commander";
    private final GregorianCalendar date1 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
    private final GregorianCalendar date2 = new GregorianCalendar(2020, Calendar.FEBRUARY, 28);
    private final double firepower1 = 11.11;
    private final double firepower2 = 22.22;

    @BeforeEach
    void setUp() {
        this.squad = new Squad();
        squad.addSoldier(id1, name1, type1, rank1, date1, firepower1);
        squad.addSoldier(id2, name2, type2, rank2, date2, firepower2);
    }

    @Test
    void addSoldier() {
        int id = 8;
        String name = "Pepe";
        String type = "Toilet Cleaner";
        String rank = "General";
        GregorianCalendar date = new GregorianCalendar(123, Calendar.OCTOBER, 3);
        double firepower = 3.1415;
        squad.addSoldier(id, name, type, rank, date, firepower);
        assertTrue(squad.contains(id, name, type, rank, date, firepower));
    }

    @Test
    void removeSoldier() {
        squad.removeSoldier(id1);
        assertFalse(squad.contains(id1));
    }

    @Test
    void getFirepower() {
        assertEquals(squad.getFirepower(), firepower1 + firepower2);
    }

    @Test
    void makeLeader() {
        squad.makeLeader(id1);
        assertEquals(squad.getLeader().getId(), id1);
    }

    @Test
    void contains() {
        assertTrue(squad.contains(id1, name1, type1, rank1, date1, firepower1));
    }

    @Test
    void containsReturnsFalse() {
        assertFalse(squad.contains(546, name1, type1, rank1, date1, firepower1));
    }

    @Test
    void containsID() {
        assertTrue(squad.contains(id1));
    }

    @Test
    void containsIDReturnsFalse() {
        assertFalse(squad.contains(524));
    }
}