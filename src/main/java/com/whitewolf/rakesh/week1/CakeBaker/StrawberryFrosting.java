package com.whitewolf.rakesh.week1.CakeBaker;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberryFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Strawbeery Cream";
    }
}
