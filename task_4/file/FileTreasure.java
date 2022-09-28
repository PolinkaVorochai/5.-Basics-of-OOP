package part_5.task_4.file;


import part_5.task_4.Treasure.TreasureAggregator;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

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
public class FileTreasure {
    private String nameFile;

    public FileTreasure(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    /*
      информация о всех сокровищах,
      чтение из файла
            */
    public void readFile() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(nameFile))) {
            TreasureAggregator treasureAggregator = (TreasureAggregator) obj.readObject();
            System.out.println("Список сокровищ " + treasureAggregator.toString());
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }


    /*
поиск самого дорого
сокровища из файла
 */
    public void highPrice() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(nameFile))) {
            TreasureAggregator treasureAggregator = (TreasureAggregator) obj.readObject();
            System.out.println("Самое дорогое сокровище " + treasureAggregator.reachVeryPrice());
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }


    /*
поиск сокровищ на заданную
сумму из файла
*/
    public void searchTreasure() {
        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(nameFile))) {
            TreasureAggregator treasureAggregator = (TreasureAggregator) obj.readObject();
            System.out.println(treasureAggregator.reachTreasure());
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}

