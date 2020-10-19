package design_patterns.service;

import design_patterns.service.inter.MailHandler;

public class MailHandler1 implements MailHandler {
    @Override
    public void sendMail() {
        System.out.println("Welcome to our company");
    }
}
