package ru.vostenzuk.mentoring.unit2.ex3;

public class Viber implements Messenger {

    public void sendMessage(Object message) {
        System.out.printf("You've sent a message \"%s\" with Viber. It's good that you talk to your grandma!", message);
    }

    @Override
    public Object readMessage() {
        System.out.println("Read a message with WhatsApp. It's mother, again.");
        return "Something that looks like message";
    }
}
