package part_5.task_5.part_A.bean;

import java.util.Set;

public class FlowersComposition {
    private Set<Flower> flower;
    private Packing packing;

    public void setFlower(Set<Flower> flower) {
        if (flower != null) {
            this.flower = flower;
        } else {
            System.out.println("Вы не выбрали цветы");
        }
    }

    public void setPacking(Packing packing) {
        if (packing != null) {
            this.packing = packing;
        } else {
            System.out.println("Вы не выбрали упаковку");
        }

    }

    @Override
    public String toString() {
        return "Ваш заказ: " + "\n" +
                "ЦВЕТЫ - " +
                flower + "\n" +
                "УПАКОВКА - " +
                packing;
    }
}
