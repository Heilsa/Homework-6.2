import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(arr));
        int totalExpenses = 0;
        for (int expense : arr) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

        System.out.println("Задача 2");
        int minExpenses = arr[0];
        int maxExpenses = arr[0];
        int totalExpensess = 0;
        for (int expense : arr) {
            totalExpensess += expense;
            if (expense < minExpenses) {
                minExpenses = expense;
            }
            if (expense > maxExpenses) {
                maxExpenses = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");
        System.out.println("Задача 3");
        int totalExpensesss = 0;
        for (int expense : arr) {
            totalExpensesss += expense;
        }
        double averageExpenses = totalExpensesss / 4.0;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей.");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(reverseFullName));
    }
}

