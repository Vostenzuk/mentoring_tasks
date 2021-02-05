package ru.vostenzuk.mentoring.unit1.ex5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook("Тетрадочка", 3);

        notebook.addRecord("Первая запись");

        System.out.println(Arrays.toString(notebook.getRecords()));

        notebook.editRecord(notebook.getRecords()[0].getId(), "Та же первая запись, но с другим текстом.");

        notebook.addRecord("Вторая запись");
        notebook.addRecord("Третья запись");
        System.out.println(Arrays.toString(notebook.getRecords()));

        notebook.addRecord("А вот тут мы уже напоремся на ошибку, потому что закончились страницы для записей.");

    }
}
