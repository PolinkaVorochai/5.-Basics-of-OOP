package part_5.task_5.part_A.builder;

import part_5.task_5.part_A.bean.Flower;
import part_5.task_5.part_A.bean.FlowersComposition;
import part_5.task_5.part_A.bean.Packing;

import java.util.Set;

public class BuilderFlowers {
    private Set<Flower> flower;
    private Packing packing;

    public BuilderFlowers buildFlower(Set<Flower> flower) {
        this.flower = flower;
        return this;
    }

    public BuilderFlowers buildPacking(Packing packing) {
        this.packing = packing;
        return this;
    }

    public FlowersComposition build() {
        FlowersComposition flowersComposition = new FlowersComposition();
        flowersComposition.setFlower(flower);
        flowersComposition.setPacking(packing);
        return flowersComposition;
    }
}
