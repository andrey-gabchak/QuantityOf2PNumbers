package com.gabchak;

public class Main {

    private int[] fillArray(int begining, int end) {
        int[] array = new int[end - begining];
        for (int i = begining, j = 0; i <= end; i++, j++) {
            array[j] = i;
        }
        return array;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] inputArray = main.fillArray(1000, 9999);

        int counter = main.countQuantityOf2PNumbers(inputArray);

        System.out.println(counter);
    }

    private int countQuantityOf2PNumbers(int[] inputArray) {

        int counter = 0;

        for (int elem : inputArray) {
            if ((elem / 1000 + (elem / 100) % 10) == ((elem / 10) % 10 + elem % 10)) {
                counter++;
            }
        }
        return counter;
    }

}
