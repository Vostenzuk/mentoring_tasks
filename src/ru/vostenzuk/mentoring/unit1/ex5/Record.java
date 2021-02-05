package ru.vostenzuk.mentoring.unit1.ex5;

import java.util.UUID;

/**
 * Класс, отвечающий за Запись в блокноте
 *
 * @see Notebook
 */
public class Record {

    /**
     * Идентификатор заметки
     */
    private UUID id;
    /**
     * Текст заметки
     */
    private String text;

    /**
     * Конструктор класса
     *
     * @param text текст записи в блокноте
     */
    public Record(String text) {
        this.id = UUID.randomUUID();
        this.text = text;
    }

    /**
     * Возвращает идентификатор заметки
     *
     * @return идентификатор заметки
     */
    public UUID getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор заметки
     *
     * @param id идентификатор заметки UUID
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Возвращает текст заметки
     *
     * @return текст заметки
     */
    public String getText() {
        return text;
    }

    /**
     * Устанавливает текст заметки
     *
     * @param text текст заметки
     */
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Record{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
