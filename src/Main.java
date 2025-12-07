public class Main {
    public static void main(String[] args) {
        Product phone1 = new Product(101, "iPhone ", 90, "Смартфоны");
        Product phone2 = new Product(102, "Samsung ", 89, "Смартфоны");
        Product laptop = new Product(201, "MacBook ", 149, "Ноутбуки");
        Product duplicatePhone = new Product(101, "iPhone 1", 109, "Смартфоны");

        System.out.println("Созданные товары:");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(laptop);
        System.out.println(duplicatePhone);

        System.out.println("Сравнение товаров:");
        System.out.println("phone1 == phone2: " + phone1.equals(phone2));
        System.out.println("phone1 == duplicatePhone: " + phone1.equals(duplicatePhone));
        System.out.println("phone2 == laptop: " + phone2.equals(laptop));

        Product[] basket1 = {phone1, laptop};
        Product[] basket2 = {phone1, laptop};
        Product[] basket3 = {laptop, phone1};
        Product[] basket4 = {phone1, phone2};

        Order orderA = new Order("Петров", basket1);
        Order orderB = new Order("Петров", basket2);
        Order orderC = new Order("Иванов", basket1);
        Order orderD = new Order("Петров", basket3);
        Order orderE = new Order("Петров", basket4);

        System.out.println("Созданные заказы:");
        System.out.println(orderA);
        System.out.println(orderB);
        System.out.println(orderC);
        System.out.println(orderD);
        System.out.println(orderE);


        System.out.println("Сравнение заказов:");
        System.out.println("orderA == orderB: " + orderA.equals(orderB));
        System.out.println("orderA == orderC: " + orderA.equals(orderC));
        System.out.println("orderA == orderD: " + orderA.equals(orderD));
        System.out.println("orderA == orderE: " + orderA.equals(orderE));
    }
}