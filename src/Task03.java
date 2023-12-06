public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание: 3");
        // Инициализация массива
        int[] array = {1, 1, 1, 1};

        // Проверка значений массива
        boolean allValues = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                allValues = false;
                break;
            }
        }

        // Вывод результата
        if (allValues) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
