package com.Epicode.demoSpring.service;

import com.Epicode.demoSpring.Tavolo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class TavoloService {
    @Autowired
    @Qualifier("tavolo1")
    ObjectProvider<Tavolo> tavoloObjectProvider;
    public Tavolo createTavolo1 (){
        return tavoloObjectProvider.getObject();
    }

    @Autowired
    @Qualifier("tavolo2")
    ObjectProvider<Tavolo> tavoloObjectProvider2;
    public Tavolo createTavolo2 (){
        return tavoloObjectProvider2.getObject();
    }

    @Autowired
    @Qualifier("tavolo3")
    ObjectProvider<Tavolo> tavoloObjectProvider3;
    public Tavolo createTavolo3 (){
        return tavoloObjectProvider3.getObject();
    }

}

