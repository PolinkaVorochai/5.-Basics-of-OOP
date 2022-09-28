package part_5.task_5.part_A.bean;

public enum Packing {

    Basket1("Корзинка маленькая", 2.50), Basket2("Корзинка средняя", 3.50), Basket3("Корзинка большая", 4.99),
    Net("Сетка", 1.20), Felt("Фетр", 2.50),
    Organza("Органза", 3.30), No("Без упаковки", 0.00);
    private String name;
    private double price;

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

