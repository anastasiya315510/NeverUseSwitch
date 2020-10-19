package design_patterns.service;

import design_patterns.service.inter.MailHandler;

public class MailHandler2 implements MailHandler {
    @Override
    public void sendMail() {
        System.out.println("dont call us, we call you");
    }
}
