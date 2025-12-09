public class Main {
    public static void main(String[] args) {
        var inventory = new store.Inventory();

        var p1 = new product("A100", "Ноутбук", 10);
        var p2 = new product("B200", "Мишка", 50);
        var p3 = new product("C300", "Клавіатура", 20);
        var p4 = new product("D400", "Монітор", 15);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);

        System.out.println("--- Всі товари на складі ---");
        inventory.printAllProducts();

        System.out.println("\n--- Пошук товарів ---");
        inventory.findProduct("A100");
        inventory.findProduct("Z999");
        inventory.findProduct("B200");

        System.out.println("\n--- Видалення товару B200 (Мишка) ---");
        inventory.removeProduct("B200");

        System.out.println("\n--- Склад після видалення ---");
        inventory.printAllProducts();
    }
}