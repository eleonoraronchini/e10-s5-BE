package com.Epicode.demoSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.time.LocalTime;
import java.util.List;


@Component
public class Ordine {
    private static int count = 1;
    private int id;
    private StatoOrdine statoOrdine;
    private int places;
    private LocalTime ora;
    private List<ElementiMenu> menuList;
    private Tavolo tavolo;
    private double bill;    //somma dei costi dei suoi elementi e dei coperti
    @Value("${ordine.admin.coperto}")
    private double coperto;

    public Ordine(StatoOrdine statoOrdine, int places, List<ElementiMenu> menuList, Tavolo tavolo, double coperto) {
        this.id = count ++;
        this.statoOrdine = statoOrdine;
        this.places = places;
        this.ora = LocalTime.now();
        this.menuList = menuList;
        this.tavolo = tavolo;
        this.bill = bill;
        this.coperto = coperto;
    }

    public Ordine() {
    }

    public double TotaleOrdine (){
        System.out.println("Ordine num." + this.id);
        System.out.println(this.menuList);
        double totale = this.menuList.stream().mapToDouble(ElementiMenu::getPrice).sum() + (this.coperto * this.places);
        System.out.println("Totale ordine:" + totale + "€");
        return totale;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public LocalTime getOra() {
        return ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public List<ElementiMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<ElementiMenu> menuList) {
        this.menuList = menuList;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public double getCoperto() {
        return coperto;
    }

    public void setCoperto(double coperto) {
        this.coperto = coperto;
    }



    @Override
    public String toString() {
        return
                "ORDINE num." + id +
                ", stato ordine: " + statoOrdine +
                ", numero prenotati:" + places +
                ", ora:" + ora +
                ", costo totale:" + bill +
                ", coperto per persona:" + coperto +
                '}';
    }
}




