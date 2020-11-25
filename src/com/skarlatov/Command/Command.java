package com.skarlatov.Command;

public interface Command {

    void execute();

    // possible to add an undor or redo commands

}


class OpenFileCommand implements Command {

    //reference to a receiver object
    private FileSystemReceiver fileSystem;

    // store previouse state for undo operation
    // somestate someState = null;
    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.openFile();
    }

//    public void undo(){
//        // restore previous state
//        //mymbemer varaible  = previous state
//    }

}


class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}


class WriteFileCommand implements Command {
    FileSystemReceiver fileSystemReceiver ;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver = fileSystemReceiver;

    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}