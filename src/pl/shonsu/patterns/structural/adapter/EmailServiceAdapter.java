package pl.shonsu.patterns.structural.adapter;

public class EmailServiceAdapter implements SendingService {
    final private EmailService emailService;

    public EmailServiceAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void send(String message) {
        System.out.println("In the EmailServiceAdapter");
        emailService.sendEmail(message);
    }
}
