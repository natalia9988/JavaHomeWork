package HW_1;
//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
     static int TriangleNumber(int n) {
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum += index + 1;
        }
        return sum;
    }

    static int FactorialNumber(int n) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= index + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
           int n = scn.nextInt();
                System.out.printf("Треугольное число от %d это: %s ", n, TriangleNumber(n));
                System.out.println();
                System.out.printf("Факториал от %d это: %s ", n, FactorialNumber(n));
            }
}
