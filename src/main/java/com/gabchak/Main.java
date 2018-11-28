package com.gabchak;

public class Main {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1000; i <= 9999; i++) {
            if ((i / 1000 + (i / 100) % 10) == ((i / 10) % 10 + i % 10)) {
                counter++;
            }
        }

        System.out.println(counter);
    }

}
