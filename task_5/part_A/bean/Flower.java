package part_5.task_5.part_A.bean;

import java.util.Objects;

public class Flower {
    private EnumFlower flower;
    private int numberFlower;

    public Flower(EnumFlower flower, int numberFlower) {
        this.flower = flower;
        if (numberFlower < 1) {
            System.out.println("Выбрано несуществующее количество цветов");
        } else {
            this.numberFlower = numberFlower;
        }
    }

    public int getNumberFlower() {
        return numberFlower;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наименование: " + flower.getName() + ", ");
        stringBuilder.append("стоимость " + flower.getPrice() + " BYN" + ", ");
        stringBuilder.append("количество " + getNumberFlower() + " штук");
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower1 = (Flower) o;
        return flower == flower1.flower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flower);
    }
}
