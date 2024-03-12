package org.example;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        int[] array = generateRandomArray(6);
        int countEven = countEvenNumbers(array);
        System.out.println("Количество чётных чисел: " + countEven);


        List<String> collection = new ArrayList<>();
        collection.add("Highload");
        collection.add("High");
        collection.add("Load");
        collection.add("Highload");
        int highCount = countHigh(collection);
        System.out.println("Количество объектов 'High' в коллекции: " + highCount);

        String firstElement = getFirstElement(collection);
        System.out.println("Первый элемент в коллекции: " + firstElement);

        String lastElement = getLastElement(collection);
        System.out.println("Последний элемент в коллекции: " + lastElement);

    }
    public static int[] generateRandomArray(int size) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);

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
    private static int countHigh(List<String> collection) {
        int count = 0;
        for (String str : collection) {

            if (str.equals("High")) {

                count++;

            }

        }

        return count;

    }
    private static String getFirstElement(List<String> collection) {
        if (!collection.isEmpty()) {

            return collection.get(0);

        } else {

            return "0";

        }

    }
    private static String getLastElement(List<String> collection) {
        if (!collection.isEmpty()) {

            return collection.get(collection.size() - 1);

        } else {

            return "0";

        }

    }

}
