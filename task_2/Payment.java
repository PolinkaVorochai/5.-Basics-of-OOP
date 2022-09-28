package part_5.task_2;

import java.util.LinkedList;
import java.util.List;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно
сформировать покупку из
нескольких товаров.
*/
class Payment {
    double payment(List<Product> basketProduct) {
        double summa = 0;
        for (Product product : basketProduct) {
            summa += product.priceProduct;
        }
        return summa;
    }

    class Product {
        private String nameProduct;
        private double priceProduct;

        Product(String nameProduct, double priceProduct) {
            this.nameProduct = nameProduct;
            this.priceProduct = priceProduct;
        }
    }
}
