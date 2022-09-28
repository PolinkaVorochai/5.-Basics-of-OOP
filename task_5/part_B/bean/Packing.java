package part_5.task_5.part_B.bean;

public enum Packing {
    Basket1("Коробка маленькая", 5.50),
    Basket2("Коробка средняя", 6.50),
    Basket3("Коробка большая", 7.50);
    private final String name;
    private final double price;

    Packing(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Наименование: " + name + ", ");
        stringBuilder.append("стоимость " + price + " BYN");
        return stringBuilder.toString();
    }
}
