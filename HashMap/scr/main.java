public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // створюємо інвентар (склад)

        // делаем товары
        Product p1 = new Product("A100", "Ноутбук", 10);
        Product p2 = new Product("B200", "Мишка", 50);
        Product p3 = new Product("C300", "Клавіатура", 20);
        Product p4 = new Product("D400", "Монітор", 15);

        //добавляем в инв
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        // вывожим
        System.out.println("--- Всі товари на складі ---");
        inventory.printAllProducts();

        // ищем товар
        System.out.println("\n--- Пошук товарів ---");
        inventory.findProduct("A100"); // Існуючий товар
        inventory.findProduct("Z999"); // Неіснуючий товар
        inventory.findProduct("B200"); // Існуючий товар

        //удаляем 
        System.out.println("\n--- Видалення товару B200 (Мишка) ---");
        inventory.removeProduct("B200");

   // вывожим
        System.out.println("\n--- Склад після видалення ---");
        inventory.printAllProducts();
    }
}
