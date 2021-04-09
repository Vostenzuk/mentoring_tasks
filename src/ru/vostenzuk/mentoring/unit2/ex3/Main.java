package ru.vostenzuk.mentoring.unit2.ex3;

import java.util.List;

/**
 * Задание 3. Интерфейсы
 * Разработать программу, которая предоставит возможность клиенту общаться в мессенджере.
 * Создать 3 мессенджера, у которых должны быть обязательно определены методы sendMessage() и readMessage().
 * У клиента может быть только 1 из 3 мессенджеров, но заранее неизвестно, какой именно.
 */
public class Main {

    public static void main(String[] args) {

        List<Messenger> messengers = List.of(new WhatsApp(), new Telegram(), new Viber());
        User user = new User("Fjodor");
        for (Messenger messenger : messengers) {
            user.setMessenger(messenger);
            user.readMessage();
            user.sendMessage("Hey!");
        }
    }
}
