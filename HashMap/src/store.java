import java.util.HashMap;
import java.util.Map;

public class store {
    // интерфейс мап для гибкости
    private final Map<String, product> products = new HashMap<>();

    public void addProduct(product product) {
        // в record метод получ поля наз как само поле
        products.put(product.code(), product);
    }

    public void removeProduct(String productCode) {
        if (products.containsKey(productCode)) {
            products.remove(productCode);
            System.out.println("Товар з кодом " + productCode + " видалено.");
        } else {
            System.out.println("Не вдалося видалити: товару з кодом " + productCode + " немає.");
        }
    }

    public void findProduct(String productCode) {
        product product = products.get(productCode);
        if (product == null) {
            System.out.println("Товару з таким кодом немає: " + productCode);
        } else {
            System.out.println("Знайдено: " + product);
        }
    }

    public void printAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Склад порожній.");
        } else {
            for (product p : products.values()) {
                System.out.println(p);
            }
        }
    }

    public static class Inventory {
        // интерфейс мап для гибкости
        private final Map<String, product> products = new HashMap<>();

        public void addProduct(product product) {
            // в record метод получ поля наз как само поле
            products.put(product.code(), product);
        }

        public void removeProduct(String productCode) {
            if (products.containsKey(productCode)) {
                products.remove(productCode);
                System.out.println("Товар з кодом " + productCode + " видалено.");
            } else {
                System.out.println("Не вдалося видалити: товару з кодом " + productCode + " немає.");
            }
        }

        public void findProduct(String productCode) {
            product product = products.get(productCode);
            if (product == null) {
                System.out.println("Товару з таким кодом немає: " + productCode);
            } else {
                System.out.println("Знайдено: " + product);
            }
        }

        public void printAllProducts() {
            if (products.isEmpty()) {
                System.out.println("Склад порожній.");
            } else {
                for (product p : products.values()) {
                    System.out.println(p);
                }
            }
        }
    }
}