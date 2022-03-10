package com.company;
import java.util.Scanner;

public class Main {
    public static int readIn(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("input %s ", name);
        int v = scanner.nextInt();
        return v;
    }
    public static int numbers(){
        int n = readIn("amount of results:");
        return n;
    }

    public static void main(String[] args) {
        randomNumbers.generator(numbers());

    }
}
