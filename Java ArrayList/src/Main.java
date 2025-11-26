import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Створення нового списку масиву (ArrayList), додавання кількох кольорів
        ArrayList<String> color = new ArrayList<String>();
        color.add("Magenta");
        color.add("Violet");
        color.add("Lavender");

        // 2. Ітерація по всіх елементах списку масиву
        System.out.println("Масив:");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        // 3. Вставка елемента у список масиву на першу позицію
        color.add(0, "Pink");

        System.out.println();
        System.out.println("Масив після вставки Pink на початок:");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        System.out.println();
        System.out.println("Елемент під індексом 1: " + color.get(1));

        // 4. Оновлення конкретного елемента списку заданим елементом
        color.set(0, "Fuchsia");

        System.out.println();
        System.out.println("Масив після заміни 0-го елемента на Fuchsia:");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        // 5. Видалення третього елемента зі списку масиву (індекс 2)
        System.out.println();
        System.out.println("Видалений елемент: " + color.remove(2));

        System.out.println();
        System.out.println("Масив після видалення:");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        // 6. Пошук елемента у списку масиву
        System.out.println();
        System.out.println("Чи є у масиві Violet? " + color.contains("Violet")); // Буде false
        System.out.println("Чи є у масиві Magenta? " + color.contains("Magenta")); // Буде true

        // 7. Сортування заданого списку масиву
        System.out.println();
        Collections.sort(color);

        System.out.println("Масив після сортування:");
        for (String i : color ) {
            System.out.println(i);
        }

        // 8. Копіювання одного списку масиву в інший
        ArrayList<String> color2 = (ArrayList)color.clone();

        System.out.println();
        System.out.println("Скопійований масив (color2):");
        for (String i : color2 ) {
            System.out.println(i);
        }

        // 9. Реверсування елементів у списку масиву
        System.out.println();
        System.out.println("Масив реверсований:");
        Collections.reverse(color);
        System.out.println(color);

        // 10. Порівняння двох списків масиву
        ArrayList<String> otherColors = new ArrayList<String>();
        otherColors.add("Magenta");
        otherColors.add("Violet");
        otherColors.add("Lavender");

        boolean areEqual = color.equals(otherColors);
        System.out.println();
        System.out.println("Чи однакові списки (color та otherColors)? " + areEqual);

        // 11. Очищення списку масиву
        color2.clear();
        System.out.println();

        // 12. Перевірка, чи список масиву є порожнім
        System.out.println("Чи є скопійований масив пустим? " + color2.isEmpty());
        System.out.println("Чи є початковий масив пустим? " + color.isEmpty());

        System.out.println();

        // 13. Збільшення розміру списку масиву (внутрішня оптимізація)
        color.ensureCapacity(10);

        // 14. Обрізання місткості списку масиву до поточного розміру
        ((ArrayList)color).trimToSize();
    }
}