import java.util.Scanner;

public class Main {

    public static int[] Check_number(String num) {
        int s = 0;
        int d = 0;

            int[] x = new int[10];
        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) {
                s++;
            } else if (num.charAt(i) == 'I') {
                d++;
            } else if (num.charAt(i) == 'V') {
                d++;
            } else if (num.charAt(i) == 'X') {
                d++;
            } else if (num.charAt(i) == 'L') {
                d++;
            } else if (num.charAt(i) == 'C') {
                d++;
            } else if (num.charAt(i) == 'D') {
                d++;
            } else if (num.charAt(i) == 'M') {
                d++;
            }
        }
        if (s == num.length()) {
            x[0] = 0;
            x[1] = Integer.parseInt(num);
        }
        else if (d == num.length()) {
            roman_numerals z1 = roman_numerals.valueOf(num);
            x[0] = 1;
            x[1] = z1.getCode_to_roman();
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
        int x;
        int y;
        int z;
        Scanner in = new Scanner(System.in);
        String num1 = in.next();
        char Operation1 = in.next().charAt(0);
        if (Operation1 == '+')
            op = Operation.SUM;
        else if (Operation1 == '-')
            op = Operation.SUBTRACT;
        else if (Operation1 == '/')
            op = Operation.DIVIDE;
        else if (Operation1 == '*')
            op = Operation.MULTIPLY;
        else {
            System.out.println("throws Exception //т.к. строка не является математической операцией\n");
            return;
        }
        String num2 = in.next();
        in.close();
        x = Check_number(num1)[1];
        y = Check_number(num2)[1];
        z = op.action(x, y);
        if (Check_number(num1)[0] == 1 && Check_number(num2)[0] == 1) {
            if (z < 0) {
                System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел\n");
            }
            if (z >= 0) {
                System.out.println(Romanic_number(z));
            }
        }
        else if (Check_number(num1)[0] != Check_number(num2)[0]) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления\n");
        }
        else if (Check_number(num1)[0] == 0 && Check_number(num2)[0] == 0) {
            System.out.println(z);
        }
    }
}
