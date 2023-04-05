package pl.shonsu.patterns.structural.adapter;

public class EmailService {
    public void  sendEmail(String message){
        System.out.println("Sending " + message + " via email");
    }
}
