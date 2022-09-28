package part_5.task_5.part_B.bean;

public enum SweetEnum {
    Sweet1("Батончик Нуга", 1.12, 100),
    Sweet2("Шоколадка Аленка", 2.55, 100),
    Sweet3("Шоколадка Мишка", 3.25, 125),
    Sweet4("Батончик Спартак", 1.65, 90),
    Sweet5("Шоколадка Импрессо", 3.35, 250),
    Sweet6("Шоколадка Минчанка", 1.15, 90),
    Sweet7("Шоколадка Лилия", 3.55, 300),
    Sweet8("Шоколадка Горькая", 5.60, 250);

    public static final String priceStep = "BYN";
    public static final String weightStep = "грамм";
    private final String name;
    private final double price;
    private final double weight;

    SweetEnum(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
