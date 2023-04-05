package pl.shonsu.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        EmailServiceAdapter serviceAdapter = new EmailServiceAdapter(new EmailService());
        Text text = new Text(serviceAdapter);
        text.send("test message");

        SmsServiceAdapter smsServiceAdapter = new SmsServiceAdapter();
        smsServiceAdapter.send("second message");
    }
}
