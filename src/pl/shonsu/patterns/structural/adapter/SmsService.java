package pl.shonsu.patterns.structural.adapter;

public class SmsService {
    public void sendSms(String message){
        System.out.println("Sending " + message + " via sms");
    }
}