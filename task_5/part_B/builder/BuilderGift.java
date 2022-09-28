package part_5.task_5.part_B.builder;

import part_5.task_5.part_B.bean.Gift;
import part_5.task_5.part_B.bean.Packing;
import part_5.task_5.part_B.bean.Sweet;

import java.util.Set;

public class BuilderGift {
    private Set<Sweet> sweet;
    private Packing packing;


    public BuilderGift buildSweet(Set<Sweet> sweet) {
        this.sweet = sweet;
        return this;
    }

    public BuilderGift buildPacking(Packing packing) {
        this.packing = packing;
        return this;
    }

    public Gift build() {
        Gift gift = new Gift();
        gift.setSweet(sweet);
        gift.setPacking(packing);
        return gift;
    }
}
