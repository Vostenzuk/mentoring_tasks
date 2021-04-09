package ru.vostenzuk.mentoring.unit2.ex3;

public class WhatsApp implements Messenger {

    public void sendMessage(Object message) {
        System.out.printf("Sent message with WhatsApp. It's \"%s\"", message);
    }

    @Override
    public Object readMessage() {
        System.out.println("Read a message with WhatsApp. It's mother, again.");
        return "Some object that looks like message";
    }
}
