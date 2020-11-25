package com.skarlatov.Command;

public class Client {
    public static void main(String[] args){
        //create the receiver
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //create the command with the associating receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

//        creating invoker and associate it witht he command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        //perform action on invoker object
        fileInvoker.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);


        WriteFileCommand writeFilecommand = new WriteFileCommand(fs);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.execute();

        CloseFileCommand closeCommand = new CloseFileCommand(fs);
        fileInvoker = new FileInvoker(closeCommand);
        fileInvoker.execute();





    }
}
