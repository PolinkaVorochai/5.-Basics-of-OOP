package part_5.task_5.part_B.bean;

import java.util.Objects;

public class Sweet {
    private final SweetEnum sweetEnum;
    private final int number;

    public Sweet(SweetEnum sweetEnum, int number) {
        this.sweetEnum = sweetEnum;
        this.number = number;
    }

    public SweetEnum getSweetEnum() {
        return sweetEnum;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "наименование - " + sweetEnum.getName() + ", " +
                "стоимость за штуку - " + sweetEnum.getPrice() + " " + SweetEnum.priceStep + ", " +
                "количество - " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return number == sweet.number && sweetEnum == sweet.sweetEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetEnum, number);
    }
}
