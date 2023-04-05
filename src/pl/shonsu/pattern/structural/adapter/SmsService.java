package pl.shonsu.pattern.structural.adapter;

public class SmsService {
    public void sendSms(String message){
        System.out.println("Sending " + message + " via sms");
    }
}