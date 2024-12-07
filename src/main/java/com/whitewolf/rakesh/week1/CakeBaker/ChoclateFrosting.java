package com.whitewolf.rakesh.week1.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.type", havingValue = "Choclate")
public class ChoclateFrosting implements Frosting{
    @Override
    public String getFrostingType(){
        return "Choclate Cream";
    }
}
