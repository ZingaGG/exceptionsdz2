package org.example;

import javax.sound.midi.Soundbank;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

//  Task1
    public static float task1(){
        float res;
        try {
            System.out.println("Enter digit = ");
            res = scanner.nextFloat();
            return res;
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();
            return task1();
        }
    }

//  Task2
    public static void task2() {
        Integer[] intArray = new Integer[10]; // Во первых создадим массив на условных 10 элементов
        try {
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException | IndexOutOfBoundsException e) { // Здесь добавим исключение на проверку элмента на null и выхода за границы, так как массив может не иметь 8 элемента
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
//  Task3
    public static void task3(){
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e) { // Добавили обработку деления на 0
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // Это должно быть внизу, потому что сначала обрабатываем конкретные ошибки, иначе мы бы в блоки catch для них не попали
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // Убрал FileNotFoundException, потому что мы не работаем с файлами)
        System.out.println(a + b);
    }
//  Task4
    public static String task4() throws RuntimeException{
        String res;
        try {
            System.out.println("Input string - ");
            res = scanner.nextLine();
            if(res.isEmpty()){
                throw new RuntimeException("String must not be empty!");
            }
            return res;
        } catch (RuntimeException e) {
            System.out.println("Execptiond faced " + e);
            return null;
        }

    }

    public static void main(String[] args) {
//        System.out.println(task1());
//        task2();
//        task3();
//        System.out.println(task4());
    }
}