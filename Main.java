import java.util.Scanner;

public class Main {

    public static int[] Check_number(String num) {
        int[] x = new int[10];
        try {
            if (Integer.parseInt(num) <= 10 && Integer.parseInt(num) > 0) {
                x[1] = Integer.parseInt(num);
                x[0] = 0;
            }
            else {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException r) {
            System.out.println("throws Exception // т.к. введенное значение не входит в промежуток с 1 до 10");
        } catch (NumberFormatException e) {
            try {
                roman_numerals z1 = roman_numerals.valueOf(num);
                x[1] = z1.getCode_to_roman();
                x[0] = 1;
            } catch (IllegalArgumentException e1) {
                System.out.println("throws Exception // т.к. введенное значение не является римским и арабским числом или больше X");
                x[0] = 1;
            }
        }
        return x;
    }

    public static String Romanic_number(int num) {
        String romanic_number = "";
        String i = "I";
        String iv = "IV";
        String v = "V";
        String ix = "IX";
        String x = "X";
        String xl = "XL";
        String l = "L";
        String xc = "XC";
        String c = "C";
        String cd = "CD";
        String d = "D";
        String cm = "CM";
        String m = "M";

        for (int y = num / 1000; y > 0; y--) {
            romanic_number += m;
        }
        num = num % 1000;
        for (int y = num / 900; y > 0; y--) {
            romanic_number += cm;
        }
        num = num % 900;
        for (int y = num / 500; y > 0; y--) {
            romanic_number += d;
        }
        num = num % 500;
        for (int y = num / 400; y > 0; y--) {
            romanic_number += cd;
        }
        num = num % 400;
        for (int y = num / 100; y > 0; y--) {
            romanic_number += c;
        }
        num = num % 100;
        for (int y = num / 90; y > 0; y--) {
            romanic_number += xc;
        }
        num = num % 90;
        for (int y = num / 50; y > 0; y--) {
            romanic_number += l;
        }
        num = num % 50;
        for (int y = num / 40; y > 0; y--) {
            romanic_number += xl;
        }
        num = num % 40;
        for (int y = num / 10; y > 0; y--) {
            romanic_number += x;
        }
        num = num % 10;
        for (int y = num / 9; y > 0; y--) {
            romanic_number += ix;
        }
        num = num % 9;
        for (int y = num / 5; y > 0; y--) {
            romanic_number += v;
        }
        num = num % 5;
        for (int y = num / 4; y > 0; y--) {
            romanic_number += iv;
        }
        num = num % 4;
        for (int y = num; y > 0; y--) {
            romanic_number += i;
        }
        return romanic_number;
    }

    public static void main(String[] args) {
        Operation op = null;
        int[] x;
        int[] y;
        int z;
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        char Operation1 = in.next().charAt(0);
        try {
            if (Operation1 == '+')
                op = Operation.SUM;
            else if (Operation1 == '-')
                op = Operation.SUBTRACT;
            else if (Operation1 == '/')
                op = Operation.DIVIDE;
            else if (Operation1 == '*')
                op = Operation.MULTIPLY;
            if (Operation1 != '+' && Operation1 != '-' && Operation1 != '/' && Operation1 != '*') {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException s) {
            System.out.println("throws Exception // т.к. строка не является математической операцией\n");
            return;
        }
        String num2 = in.next();
        in.close();
        x = Check_number(num1);
        y = Check_number(num2);
        z = op.action(x[1], y[1]);
        if (x[0] == 1 && y[0] == 1) {
            if (z < 0) {
                System.out.println("throws Exception // т.к. в римской системе нет отрицательных чисел\n");
            }
            if (z >= 0) {
                System.out.println(Romanic_number(z));
            }
        }
        else if (x[0] != y[0]) {
            System.out.println("throws Exception // т.к. используются одновременно разные системы счисления\n");
        }
        else if (x[0] == 0 && y[0] == 0) {
            System.out.println(z);
        }
    }
}
