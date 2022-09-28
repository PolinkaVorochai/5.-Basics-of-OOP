package part_5.task_5.part_B.bean;

import java.util.Set;

public class Gift {
    private Set<Sweet> sweet;
    private Packing packing;

    public void setSweet(Set<Sweet> sweet) {
        this.sweet = sweet;
    }

    public void setPacking(Packing packing) {
        this.packing = packing;
    }

    @Override
    public String toString() {
        return "Ваш подарок: " + "\n" +
                "Состав - " + sweet + "\n" +
                "упаковка - " + packing;
    }
}
