package pl.shonsu.patterns.structural.adapter;

public class Text {

    final private SendingService sendingService;

    public Text(SendingService sendingService) {
        this.sendingService = sendingService;
    }

    public void send(String message) {
        System.out.println("In text class");
        sendingService.send(message);
    }
}
