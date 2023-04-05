package pl.shonsu.pattern.structural.adapter;

public class SmsServiceAdapter extends SmsService implements SendingService{

    @Override
    public void send(String message) {
        super.sendSms(message);
    }
}
