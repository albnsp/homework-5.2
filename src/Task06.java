public class Task06 {
    public static void main(String[] args) {
        System.out.println("Задание: 6");
        int[] array = new int[10];

        // Заполнение массива случайными числами от -10 до +10
        for (int i = 0; i < array.length; i++) {
            double randomValue = Math.random(); // Генерация случайного числа от 0.0 до 1.0
            int scaledValue = (int) (randomValue * 21) - 10; // Масштабирование числа и приведение к нужному диапазону
            array[i] = scaledValue;
        }

        // Подсчет уникальных значений
        int[] uniqueValues = new int[array.length];
        int[] uniqueIndexes = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueValues[uniqueCount] = array[i];
                uniqueIndexes[uniqueCount] = i;
                uniqueCount++;
            }
        }

        // Вывод уникальных значений и их индексов
        System.out.println("Уникальные значения:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println("Значение: " + uniqueValues[i] + ", Индекс: " + uniqueIndexes[i]);
        }
    }
}
