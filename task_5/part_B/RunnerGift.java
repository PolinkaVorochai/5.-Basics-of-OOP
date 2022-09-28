package part_5.task_5.part_B;

import part_5.task_5.part_B.bean.Gift;
import part_5.task_5.part_B.bean.Packing;
import part_5.task_5.part_B.bean.Sweet;
import part_5.task_5.part_B.bean.SweetEnum;
import part_5.task_5.part_B.builder.BuilderGift;

import java.util.Set;

/*
Подарки. Реализовать приложение, позволяющее создавать подарки
(объект, представляющий собой подарок).
Составляющими целого подарка являются сладости и упаковка.
 */
public class RunnerGift {
    public static void main(String[] args) {
        Gift gift1 = new BuilderGift()
                .buildSweet(Set.of(new Sweet(SweetEnum.Sweet3, 5),
                        new Sweet(SweetEnum.Sweet4, 3),
                        new Sweet(SweetEnum.Sweet5, 3)
                ))
                .buildPacking(Packing.Basket2)
                .build();
        System.out.println(gift1);
    }
}

