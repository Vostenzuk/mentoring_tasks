package ru.vostenzuk.mentoring.unit1.ex5;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/**
 * Класс, отвечающий за реализацию блокнота и создание/редактирование записей в нём.
 * <p>Содержит в себе список записей</p>
 *
 * @see Record
 */
public class Notebook {

    /**
     * Идентификатор блокнота
     */
    UUID id;
    /**
     * Название блокнота
     */
    private String name;
    /**
     * Количество страниц в блокноте
     */
    private int pageCount;
    /**
     * Список заметок в блокноте
     *
     * @see Record
     */
    private Record[] records;

    /**
     * Конструктор класса Блокнот
     *
     * @param name название блокнота
     * @param pageCount количество страниц в блокноте
     */
    public Notebook(String name, int pageCount) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.pageCount = pageCount;
        this.records = new Record[0];
    }

    /**
     * Добавляет запись в блокнот. На одной странице помещается одна запись.
     *
     * @param text текст новой записи
     * @throws IndexOutOfBoundsException возникает в случае, когда для новой записи нет места
     * @see Record
     */
    public void addRecord(String text) throws IndexOutOfBoundsException {
        if (this.getUnusedPagesCount() > 0) {
            this.records = Arrays.copyOf(this.records, this.records.length + 1);
            this.records[this.records.length - 1] = new Record(text);
        } else {
            throw new IndexOutOfBoundsException("Свободных страниц не осталось.");
        }
    }

    /**
     * Редактирует запись
     *
     * @param id идентификатор записи
     * @param text новый текст записи
     */
    public void editRecord(UUID id, String text) {
        for (Record record : this.records) {
            if (Objects.equals(record.getId(), id)) {
                record.setText(text);
            }
        }
    }

    /**
     * Возвращает количество страниц, доступных для создания новой записи
     *
     * @return количество страниц, доступных для создания новой записи
     */
    private int getUnusedPagesCount() {
        return this.pageCount - records.length;
    }

    /**
     * Возвращает идентификатор блокнота
     *
     * @return идентификатор блокнота
     */
    public UUID getId() {
        return id;
    }

    /**
     * Устанавливает идентификатор Блокнота
     *
     * @param id идентификатор блокнота
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Возвращает название блокнота
     *
     * @return название блокнота
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название блокнота
     *
     * @param name название блокнота
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает количество страниц в блокноте
     *
     * @return количество страниц в блокноте
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Устанавливает количество страниц в блокноте
     *
     * @param pageCount количество страниц
     */
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * Возвращает записи в блокноте
     *
     * @return записи в блокноте
     * @see Record
     */
    public Record[] getRecords() {
        return records;
    }

    /**
     * Устанавливает новый список записей в качестве записей в блокноте
     *
     * @param records список записей в блокноте
     * @see Record
     */
    public void setRecords(Record[] records) {
        this.records = records;
    }
}
