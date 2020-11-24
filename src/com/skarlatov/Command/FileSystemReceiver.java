package com.skarlatov.Command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();

}



class UnixFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println(" Opening file in UNIX OS");
    }

    @Override
    public void writeFile() {
        System.out.println(" writing file in UNIX OS");
    }

    @Override
    public void closeFile() {
        System.out.println(" closing file in UNIX OS");
    }
}

class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println(" Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println(" writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println(" closing file in Windows OS");
    }
}

