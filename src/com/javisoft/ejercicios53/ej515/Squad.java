package com.javisoft.ejercicios53.ej515;

import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Squad {

    private Set<Soldier> soldiers;
    private Soldier leader;

    public Squad() {
        this.soldiers = new HashSet<>();
    }

    public boolean addSoldier(int id, String name, String type, String rank, GregorianCalendar dateOfRecruitment, double firepower) {
        if (containsID(id)) {
            return false;
        }
        return soldiers.add(new Soldier(id, name, type, rank, dateOfRecruitment, firepower));
    }

    protected boolean containsID(int id) {
        return soldiers.stream().anyMatch(s -> s.getId() == id);
    }

    protected boolean contains(int id, String name, String type, String rank, GregorianCalendar dateOfRecruitment, double firepower) {
        return soldiers.stream().anyMatch(
                s -> s.getId() == id &&
                        s.getName().equals(name) &&
                        s.getType().equals(type) &&
                        s.getRank().equals(rank) &&
                        s.getDateOfRecruitment() == dateOfRecruitment &&
                        s.getFirepower() == firepower
        );
    }

    public boolean removeSoldier(int id) {
        if (!containsID(id)) {
            return false;
        }
        soldiers = (HashSet<Soldier>) soldiers.stream().filter(s -> s.getId() == id).collect(Collectors.toSet());
        return true;
    }

    public Set<Soldier> getSoldiers() {
        return soldiers;
    }

    public double getFirepower() {
        return soldiers.stream().mapToDouble(Soldier::getFirepower).sum();
    }

    public boolean makeLeader(int id) {
        if (!containsID(id)) {
            return false;
        }
        this.leader = (Soldier) soldiers.stream().filter(s -> s.getId() == id).toArray()[0];
        return true;
    }

    public Soldier getLeader() {
        return leader;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        soldiers.forEach(s -> joiner.add(s.toString()));
        return joiner.toString();
    }

}
