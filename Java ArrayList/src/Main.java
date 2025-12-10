import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Створення списку
        var color = new ArrayList<String>();
        color.add("Magenta");
        color.add("Violet");
        color.add("Lavender");

        // 2. Ітерація
        System.out.println("Масив:");
        color.forEach(System.out::println);

        // 3. Вставка елемента на першу позицію
        color.add(0, "Pink");

        System.out.println("\nМасив після вставки Pink на початок:");
        color.forEach(System.out::println);

        System.out.println("\nЕлемент під індексом 1: " + color.get(1));

        // 4. Оновлення елемента
        color.set(0, "Fuchsia");

        System.out.println("\nМасив після заміни 0-го елемента на Fuchsia:");
        color.forEach(System.out::println);

        // 5. Видалення елемента
        System.out.println("\nВидалений елемент: " + color.remove(2));

        System.out.println("\nМасив після видалення:");
        color.forEach(System.out::println);

        // 6. Пошук
        System.out.println("\nЧи є у масиві Violet? " + color.contains("Violet"));
        System.out.println("Чи є у масиві Magenta? " + color.contains("Magenta"));

        // 7. Сортування
        System.out.println();
        color.sort(null); // null = стан пор сорт

        System.out.println("Масив після сортування:");
        color.forEach(System.out::println);

        // 8. Копіювання
        var color2 = new ArrayList<>(color);

        System.out.println("\nСкопійований масив (color2):");
        color2.forEach(System.out::println);

        // 9. Реверсування
        System.out.println("\nМасив реверсований:");
        Collections.reverse(color);
        System.out.println(color);

        // 10. Порівняння списків
        var otherColors = new ArrayList<>(List.of("Magenta", "Violet", "Lavender"));

        boolean areEqual = color.equals(otherColors);
        System.out.println("\nЧи однакові списки (color та otherColors)? " + areEqual);

        // 11. Очищення
        color2.clear();
        System.out.println();

        // 12. Перевірка на порожнечу
        System.out.println("Чи є скопійований масив пустим? " + color2.isEmpty());
        System.out.println("Чи є початковий масив пустим? " + color.isEmpty());

        System.out.println();

        // 13. Оптимізація розміру
        color.ensureCapacity(10);

        // 14. Обрізання
        color.trimToSize();
    }
}