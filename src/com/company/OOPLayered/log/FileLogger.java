package com.company.OOPLayered.log;

public class FileLogger implements Logger {

    @Override
    public void login(String data) {
        System.out.println("Dosya loglandı:  " + data);
    }
}
