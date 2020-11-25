package com.skarlatov.Command.challenge;

import com.skarlatov.Command.Command;

import java.util.ArrayList;
import java.util.List;

// the broker class i sthe inoker
//the broker is the invoker
public class Broker {
    private List<CommandI> orderList = new ArrayList<>();


    public void takeOrder(CommandI order){
        orderList.add(order);
    }


    public void placeOrders(){
        for(CommandI o: orderList){
            o.execute();
        }
        orderList.clear();
    }

}
