import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operation op = null;
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
        roman_numerals z1 = roman_numerals.valueOf(num1);
        roman_numerals z2 = roman_numerals.valueOf(num2);
        in.close();
        System.out.println(op.action(z1.getCode_to_roman(), z2.getCode_to_roman()));
    }
}