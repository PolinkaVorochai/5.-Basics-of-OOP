package part_5.task_4;

import part_5.task_4.file.FileTreasure;

import javax.swing.*;

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
public class UserRunner {
    public static void main(String[] args) {
        FileTreasure file = new FileTreasure("TreasureFile");
        int command;
        System.out.println("Введите цифру:" + "\n" + "1 - получить информацию о всех сокровищах дракона;" +
                "\n" + "2 - получить информацию о самом дорогом сокровище дракона;" + "\n" +
                "3 - получить информацию о  сокровищах на заданную сумму;");
        command = Integer.parseInt(JOptionPane.showInputDialog("Укажите команду"));
        switch (command) {
            case 1:
                file.readFile();
                break;
            case 2:
                file.highPrice();
                break;
            case 3:
                file.searchTreasure();
                break;
            default:
                System.out.println("Вы ввели неверную команду. Повторите ввод.");
                command = Integer.parseInt(JOptionPane.showInputDialog("Укажите команду"));
        }
    }
}
