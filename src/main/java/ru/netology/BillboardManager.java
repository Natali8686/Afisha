package ru.netology;

public class BillboardManager {
    private MovieItems[] items = new MovieItems[0];
    private int resultLength = 10; // инициализаторы полей


    public BillboardManager() {  // конструктор 1

    }

    public BillboardManager(int resultLength) { // конструктор 2
        this.resultLength = resultLength;
    }

    public void add(MovieItems item) {  // ДОБАВЛЕНИЕ НОВОГО ФИЛЬМА
        int length = items.length + 1;  // создаем новый массив размером больше на +1
        MovieItems[] tmp = new MovieItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;  //копируем имя
        items = tmp;
    }

    public MovieItems[] findAll() { // Вывод всех фильмов в порядке добавления
        return items;

    }

    public MovieItems[] findLast()  { // Вывод максим.лимита последних добавленных фильмов в обратном от добавления порядке
        if (items.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = items.length;
        }
        MovieItems[] result = new MovieItems[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i- 1;
            result[i] = items [index];
        }
        return result;
    }
}
