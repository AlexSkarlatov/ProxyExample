package com.skarlatov.Command.challenge;

public interface CommandI {
    void execute();

}

class BuyStock implements CommandI{
    private Stock receiverObject;


    public BuyStock(Stock receiverObject){
        this.receiverObject = receiverObject;
    }
    @Override
    public void execute() {
        receiverObject.buy();
    }
}

class SellStock implements CommandI {

    private Stock receiverObject;

    public SellStock(Stock receiverObject){
        this.receiverObject = receiverObject;

    }

    @Override
    public void execute() {
        receiverObject.sell();
    }
}