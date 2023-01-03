package com.company.OOPLayered.log;

public class DatabaseLogger implements  Logger{
    @Override
    public void login(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}
