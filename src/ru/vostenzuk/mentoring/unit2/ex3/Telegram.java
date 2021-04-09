package ru.vostenzuk.mentoring.unit2.ex3;

public class Telegram implements Messenger {

    public void sendMessage(Object message) {
        System.out.printf("You've sent a message \"%s\"", message);
    }

    @Override
    public Object readMessage() {
        return "Perfectly good message";
    }
}
