import java.util.HashMap;

class Inventory {
    // кдюч код значение товар
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // добавить товар
    public void addProduct(Product product) {
        products.put(product.getProductCode(), product);
    }

    // убрать товар
    public void removeProduct(String productCode) {
        if (products.containsKey(productCode)) {
            products.remove(productCode);
            System.out.println("Товар з кодом " + productCode + " видалено.");
        } else {
            System.out.println("Не вдалося видалити: товару з кодом " + productCode + " немає.");
        }
    }

    // поиск товара по кодум
    public void findProduct(String productCode) {
        Product product = products.get(productCode);
        if (product == null) {
            System.out.println("Товару з таким кодом немає: " + productCode);
        } else {
            System.out.println("Знайдено: " + product);
        }
    }

    // Ввыявод всех товаров
    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Склад порожній.");
        } else {
            for (Product p : products.values()) {
                System.out.println(p);
            }
        }
    }
}
