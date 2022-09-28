package part_5.task_4.Treasure;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
public class TreasureAggregator implements Serializable {
    private List<Treasure> treasureList;

    public TreasureAggregator(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public TreasureAggregator() {
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    /*
    поиск по коллекции
    самого дорого сокровища
     */
    public String reachVeryPrice() {
        Treasure localObj = new Treasure();
        int localPrice = 0;
        for (Treasure treasure : treasureList) {
            if (treasure.getPrice() > localPrice) {
                localPrice = treasure.getPrice();
                localObj = treasure;
            }
        }
        return localObj.toString();
    }

    /*
  поиск по коллекции
  сокровищ на заданную сумму
   */
    public StringBuilder reachTreasure() {
        int summa;
        summa = Integer.parseInt(JOptionPane.showInputDialog("Введите сумму денег  "));
        System.out.println("Вы располагаете суммой " + summa + " " + Treasure.moneyType);
        List<Treasure> result = new ArrayList<>();
        int localSumma = 0;

        for (int i = 0; i < treasureList.size(); i++) {
            int index;
            int difference = summa - localSumma;
            index = (int) (Math.random() * 99);
            if (difference >= treasureList.get(index).getPrice()) {
                result.add(treasureList.get(index));
                localSumma += treasureList.get(index).getPrice();
            } else {
               continue;
            }
        }
        StringBuilder string = new StringBuilder();
        string.append("Вы покупаете следующие сокровища: " + "\n");
        string.append(result.toString() + "\n");
        string.append("Сумма к оплате " + localSumma + " " + Treasure.moneyType);
        return string;
    }

    @Override
    public String toString() {
        return "TreasureAggregator{" +
                "treasureList=" + treasureList +
                '}';
    }
}
