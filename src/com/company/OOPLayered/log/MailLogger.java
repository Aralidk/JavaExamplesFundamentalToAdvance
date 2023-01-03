package com.company.OOPLayered.log;

public class MailLogger implements Logger{
    @Override
    public void login(String data) {
        System.out.println("Mail gönderildi. " + data);
    }
}
