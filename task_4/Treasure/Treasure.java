package part_5.task_4.Treasure;

import java.io.Serializable;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о
100 сокровищах в пещере дракона.
Реализовать возможность просмотра сокровищ,
выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.
 */
public class Treasure implements Serializable {
    final static String moneyType = "Golden coins";
    private int number;
    private String name;
    private int price;

    public Treasure(int number, String name, int price) {
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public Treasure() {
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(number + ". ");
        string.append(name + " ");
        string.append(price + " ");
        string.append(moneyType + "\n");
        return string.toString();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
