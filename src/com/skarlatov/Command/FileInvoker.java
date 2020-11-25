package com.skarlatov.Command;


// an invoker has a reference to a command object
 class FileInvoker {
    // an invoker has a reference to a command object
    public Command command;

     public FileInvoker(Command command){
         this.command = command;
     }


     public void execute(){
         command.execute();
     }




}
