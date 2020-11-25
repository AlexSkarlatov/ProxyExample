package com.skarlatov.Command.challenge;

public class Client {
    public static void main(String[] args){

        Stock googleStock = new Stock();


        BuyStock bs = new BuyStock(googleStock);
        SellStock ss = new SellStock(googleStock);



        Broker bb = new Broker();
        Broker b = new Broker();
        b.takeOrder(bs);
        bb.takeOrder(bs);
        bb.takeOrder(ss);
        bb.placeOrders();
    }


}
