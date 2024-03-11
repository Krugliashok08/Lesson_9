package org.example;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int[] array = generateRandomArray(5);

        int countEven = countEvenNumbers(array);

        System.out.println("Количество чётных чисел: " + countEven);

    }
    public static int[] generateRandomArray(int size) {

        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {

            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99

        }

        return array;

    }
    public static int countEvenNumbers(int[] array) {

        int count = 0;

        for (int num : array) {

            if (num % 2 == 0) {

                count++;

            }

        }

        return count;

    }

}