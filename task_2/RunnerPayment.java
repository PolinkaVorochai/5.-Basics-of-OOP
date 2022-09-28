package part_5.task_2;

import java.util.List;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно
сформировать покупку из
нескольких товаров.
*/
class RunnerPayment {
    public static void main(String[] args) {
        Payment.Product pizza1=new Payment().new Product("Маргарита",10.25);
        Payment.Product pizza2=new Payment().new Product("Песто",17.36);
        Payment.Product pizza3=new Payment().new Product("Домашняя",9.25);
        Payment.Product pizza4=new Payment().new Product("Баварская",15.58);
        Payment.Product pizza5=new Payment().new Product("С тунцом",19.57);
        Payment.Product pizza6=new Payment().new Product("4 сезона",17.30);
        Payment.Product pizza7=new Payment().new Product("Пепперони",19.36);
        Payment.Product pizza8=new Payment().new Product("Деревенская",17.86);
        Payment.Product pizza9=new Payment().new Product("Гавайская",25.85);
        Payment check1=new Payment();
        System.out.print("Сумма к оплате: ");
        System.out.printf("%.2f",check1.payment(List.of(pizza1,pizza4)));
        System.out.print(" BYN");
        System.out.println();
        Payment check2=new Payment();
        System.out.print("Сумма к оплате: ");
        System.out.printf("%.2f",check2.payment(List.of(pizza1,pizza4,pizza6,pizza8,pizza9)));
        System.out.print(" BYN");

    }
}
