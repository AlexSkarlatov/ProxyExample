package com.skarlatov.chainofresponsibility;

public interface DispenseChain {


    void setNextChain(DispenseChain nextChain);//set successro

    void dispense(Currency cur);//successor
}


class Dollar50Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if( cur.getAmount() > 50){
            int num = cur.getAmount() / 50;
            int remainder = cur.getAmount() % 50;
            System.out.println("Dispensing " + num + "50 notes");
            if(remainder != 0 )
                this.chain.dispense(new Currency(remainder));
        }
        else {
            this.chain.dispense(cur);
        }
    }
}
class Dollar20Dispenser implements DispenseChain {
    DispenseChain successorChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        successorChain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() > 20){
            int num = cur.getAmount() / 20;
            int remainder = cur.getAmount() % 20 ;
            System.out.println(" I am now printiong " + num + "Dollar bills" ) ;
            if(remainder !=0 )
                successorChain.dispense(new Currency(remainder));
        }
        else{
            successorChain.dispense(cur);
        }
    }
}


class Dollar10Dispenser implements DispenseChain{

    private DispenseChain successor;

    @Override
    public void setNextChain(DispenseChain nextChain) {
       this.successor = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() > 10){
            int num = cur.getAmount() / 10;
            int remainder = cur.getAmount() % 10 ;
            System.out.println(" I am now printiong " + num + "Dollar bills" ) ;
            if( remainder != 0 )
                successor.dispense(new Currency( remainder ));
        }
        else{
            successor.dispense(cur);
        }
    }

}
class Dollar1Dispenser implements DispenseChain{

    private DispenseChain successor;
    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.successor = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() > 1){
            int num = cur.getAmount() / 1;
            int remainder = cur.getAmount() % 1 ;
            System.out.println(" I am now printiong " + num + "Dollar bills" ) ;
            if( remainder != 0 )
                successor.dispense(new Currency( remainder ));
        }
        else{
            successor.dispense(cur);
        }
    }
}