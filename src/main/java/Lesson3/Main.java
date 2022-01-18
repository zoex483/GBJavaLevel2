/*
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот
телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по
фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при
запросе такой фамилии должны выводиться все телефоны.
 */

package Lesson3;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задание №1.
        List<String> names = Arrays.asList(
                "Поттер", "Уизли", "Блек", "Уотсон", "Малфой",
                "Россы", "Лавгуд", "Слизнорт", "Реддл", "Крам",
                "Диггори", "Крауч", "Лестрейндж", "Яксли", "Нотт",
                "Макмиллан", "Мракс", "Флинт", "Снейп", "Дамболдор"
        );

        Set<String> uniqueWords = new HashSet<>(names);

        System.out.println("Список уникальных слов:");
        System.out.println(uniqueWords);
        for (String key : uniqueWords) {
            System.out.println(key + ": " + Collections.frequency(names, key));
        }

        //Задание 2
        PhoneBook phoneBook = new PhoneBook();
        System.out.println();
        phoneBook.add("Снейп", "55-55-55");
        phoneBook.add("Снейп", "55-55-56");
        phoneBook.add("Дамболдор", "77-77-77");
        phoneBook.add("Малфой", "66-66-66");
        phoneBook.add("Реддл", "11-11-11");
        System.out.println();
        System.out.println(phoneBook.get("Снейп"));
        System.out.println(phoneBook.get("Дамболдор"));
        System.out.println(phoneBook.get("Реддл"));
        System.out.println(phoneBook.get("Малфой"));

        //Добавление номера для существующей фамилии
        phoneBook.add("Снейп", "55-55-55");
        //Вывод номера для фамилии "Снейп"
        System.out.println(phoneBook.get("Снейп"));
    }
}

