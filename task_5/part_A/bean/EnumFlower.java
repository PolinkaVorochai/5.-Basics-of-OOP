package part_5.task_5.part_A.bean;

public enum EnumFlower {
    Rose1("Красная роза", 4.12), Rose2("Белая роза", 3.60), Rose3("Синяя роза", 3.99), Rose4("Бородовая роза", 5.00),
    Rose5("Голландская роза", 5.99), Peony("Пион", 3.99), Chamomile("Ромашка", 0.99), Orchid("Орхидея", 3.65),
    Tulip("Тюльпан", 1.50), Lily("Лилия", 2.30), Gerbera("Гербера", 3.25);
    private String name;
    private double price;

    EnumFlower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
