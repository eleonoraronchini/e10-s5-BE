package com.Epicode.demoSpring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Tavolo {
    private int id;
    private int places;
    private StatoTavolo statotavolo;

    public Tavolo(int id, int places, StatoTavolo statotavolo) {
        this.id = id;
        this.places = places;
        this.statotavolo = statotavolo;
    }

    public Tavolo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public StatoTavolo getStatotavolo() {
        return statotavolo;
    }

    public void setStatotavolo(StatoTavolo statotavolo) {
        this.statotavolo = statotavolo;
    }

    @Override
    public String toString() {
        return
                "TAVOLO num." + id +
                ", posti a sedere:" + places +
                ", stato tavolo:" + statotavolo ;
    }
}
