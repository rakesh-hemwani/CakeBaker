package com.whitewolf.rakesh.week1.CakeBaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    final private Frosting frosting;
    final private Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    void bakeCake(){
        System.out.println("Your cake is ready : ) with Ingredients" + frosting.getFrostingType() + syrup.getSyrupType());
    }
}
