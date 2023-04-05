package pl.shonsu.patterns.structural.adapter;

public class SmsServiceAdapter extends SmsService implements SendingService{

    @Override
    public void send(String message) {
        super.sendSms(message);
    }
}
