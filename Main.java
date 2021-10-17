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

    public static void main(String[] args) {

        Operation op = null;
        int x;
        int y;
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
        x = Check_number(num1)[1];
        y = Check_number(num2)[1];
        System.out.println(op.action(x, y));
    }
}