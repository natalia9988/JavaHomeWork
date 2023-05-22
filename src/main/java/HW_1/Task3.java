package HW_1;
//Реализовать простой калькулятор
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите первое число: ");
         int numb_a = scn.nextInt();
        System.out.print("Введите операцию + - / *: ");
         char operation = scn.next().charAt(0);
        System.out.print("Введите второе число: ");
        int numb_b = scn.nextInt();
        // int res;
        if (operation == '+') {
            System.out.println(numb_a + " + " + numb_b + " = " + (numb_a + numb_b));
        } else if (operation == '-') {
            System.out.println(numb_a + " - " + numb_b + " = " + (numb_a - numb_b));
        } else if (operation == '*') {
            System.out.println(numb_a + " x " + numb_b+ " = " + (numb_a * numb_b));
        } else if (operation == '/') {
            System.out.println(numb_a + " / " + numb_b + " = " + (numb_a / numb_b));
        } else {
            System.err.print("Ошибка! Введите операцию + - / *  ");
        }
         scn.close();
     }
 }

