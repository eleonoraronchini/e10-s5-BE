package com.Epicode.demoSpring;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

@Component
public class Ordine {
    private int id;
    private StatoOrdine statoOrdine;
    private int places;
    private LocalDate orderDate;
    private List<ElementiMenu> menuList;
    private double bill;    //somma dei costi dei suoi elementi e dei coperti
    private Double coperto;

    public Ordine(int id, StatoOrdine statoOrdine, int places, LocalDate orderDate, List<ElementiMenu> menuList, Double coperto) {
        this.id = id;
        this.statoOrdine = statoOrdine;
        this.places = places;
        this.orderDate = orderDate;
        this.menuList = menuList;
        this.coperto = coperto;
        this.bill = bill;
    }

    public Ordine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StatoOrdine getStatoOrdine() {
        return statoOrdine;
    }

    public void setStatoOrdine(StatoOrdine statoOrdine) {
        this.statoOrdine = statoOrdine;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<ElementiMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<ElementiMenu> menuList) {
        this.menuList = menuList;
    }


    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }


    @Override
    public String toString() {
        return
                "ORDINE num." + id +
                ", stato dell'ordine:" + statoOrdine +
                ", coperti:" + places +
                ", data:" + orderDate +
                ", piatti e bevande ordinati:" + menuList +
                ", costo del coperto per persona:" + coperto+
                ", costo totale:" + bill +
                '}';
    }
}
