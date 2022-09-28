package part_5.task_5.part_A;

import part_5.task_5.part_A.bean.EnumFlower;
import part_5.task_5.part_A.bean.Flower;
import part_5.task_5.part_A.bean.FlowersComposition;
import part_5.task_5.part_A.bean.Packing;
import part_5.task_5.part_A.builder.BuilderFlowers;

import java.util.Set;
/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность
использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем,
но не на стороне клиента.
• для проверки корректности переданных данных можно
 применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать,
 используйте заглушку.
• Особое условие: переопределите, где необходимо,
 методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение,
позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию).
Составляющими цветочной композиции являются цветы и упаковка.
Вариант B. Подарки. Реализовать приложение,
позволяющее создавать подарки (объект, представляющий собой подарок).
 Составляющими целого подарка являются сладости и упаковка.
 */


public class RunnerFlowersComposition {
    public static void main(String[] args) {
        FlowersComposition flowersComposition1 = new BuilderFlowers()
                .buildFlower(Set.of(new Flower(EnumFlower.Rose1, 5), new Flower(EnumFlower.Gerbera,8)))
                .buildPacking(Packing.Basket2)
                .build();
        System.out.println(flowersComposition1);
    }
}
