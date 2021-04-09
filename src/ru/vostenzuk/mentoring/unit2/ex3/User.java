package ru.vostenzuk.mentoring.unit2.ex3;

public class User {

    private String name;
    private Messenger messenger;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Messenger getMessenger() {
        return messenger;
    }

    public void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sendMessage(String message) {
        messenger.sendMessage(message);
    }

    public String readMessage() {
        return (String) messenger.readMessage();
    }
}
