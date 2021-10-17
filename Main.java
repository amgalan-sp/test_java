import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operation op = null;
        int s = 0;
        int d = 0;
        int x = 0;
        int y = 0;
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
        String num2 = in.next();
        in.close();

        for (int i = 0; i < num1.length(); i++) {
            if (Character.isDigit(num1.charAt(i))) {
                s++;
            } else if (num1.charAt(i) == 'I') {
                d++;
            } else if (num1.charAt(i) == 'X') {
                d++;
            } else if (num1.charAt(i) == 'V') {
                d++;
            } else if (num1.charAt(i) == 'L') {
                d++;
            } else if (num1.charAt(i) == 'C') {
                d++;
            }
            if (s == num1.length()) {
                x = Integer.parseInt(num1);
            } else if (d == num1.length()) {
                roman_numerals z1 = roman_numerals.valueOf(num1);
                x = z1.getCode_to_roman();
            }
        }
        d = 0;
        s = 0;
        for (int i = 0; i < num2.length(); i++) {
            if (Character.isDigit(num2.charAt(i))) {
                s++;
            } else if (num2.charAt(i) == 'I') {
                d++;
            } else if (num2.charAt(i) == 'X') {
                d++;
            } else if (num2.charAt(i) == 'V') {
                d++;
            } else if (num2.charAt(i) == 'L') {
                d++;
            } else if (num2.charAt(i) == 'C') {
                d++;
            }
            if (s == num2.length()) {
                y = Integer.parseInt(num2);
            } else if (d == num2.length()) {
                roman_numerals z2 = roman_numerals.valueOf(num2);
                y = z2.getCode_to_roman();
            }
        }
        System.out.println(op.action(x, y));
    }
}