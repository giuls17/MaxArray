package org.example;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6, 4, 10, 12, 1};
        int max = findMax(numbers);
        System.out.println("Il numero massimo nell'array è: " + max);
    }
    public static int findMax(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}