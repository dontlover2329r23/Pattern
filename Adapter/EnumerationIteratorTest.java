package Adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
    public static void main(String[] args) {
        // Создаем Vector и добавляем несколько элементов
        Vector<String> vector = new Vector<>();
        vector.add("Element 1");
        vector.add("Element 2");
        vector.add("Element 3");

        // Получаем Enumeration из Vector
        Enumeration<String> enumeration = vector.elements();

        // Создаем объект EnumerationIterator
        Iterator<Object> iterator = new EnumerationIterator(enumeration);

        // Тестируем EnumerationIterator
        System.out.println("Testing EnumerationIterator:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Проверка метода remove (должен выбросить исключение)
        try {
            iterator.remove();
        } catch (UnsupportedOperationException e) {
            System.out.println("remove() method is not supported: " + e.getMessage());
        }
    }
}
