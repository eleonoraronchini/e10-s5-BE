package com.Epicode.demoSpring.service;

import com.Epicode.demoSpring.Ordine;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrdineService {
    @Autowired
    @Qualifier ("ordine1")
    ObjectProvider<Ordine> OrdineAdminProvider;
    public Ordine createOrdine1 (){
        return OrdineAdminProvider.getObject();
    }

    @Autowired
    @Qualifier("ordine2")
    ObjectProvider<Ordine> OrdineAdminProvider2;
    public Ordine createOrdine2 (){
        return OrdineAdminProvider2.getObject();
    }

    @Autowired
    @Qualifier("ordine3")
    ObjectProvider<Ordine> OrdineAdminProvider3;
    public Ordine createOrdine3 (){
        return OrdineAdminProvider3.getObject();
    }

}
