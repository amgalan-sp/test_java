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
        in.close();

        for (int i = 0; i < num1.length(); i++) {
            if (Character.isDigit(num1.charAt(i))) {
                System.out.println("Это цифры");
            }
            else
        };

        for (int i = 0; i < num2.length(); i++) {
            if (Character.isDigit(num2.charAt(i))) {
                System.out.println("Это цифры");
            }
        };
     //   Integer zx1 = Integer.valueOf(num1);
     //   Integer zx2 = Integer.valueOf(num2);


  //      roman_numerals z1 = roman_numerals.valueOf(num1);
  //      roman_numerals z2 = roman_numerals.valueOf(num2);
  //      System.out.println(op.action(z1.getCode_to_roman(), z2.getCode_to_roman()));
        //       System.out.println(op.action(zx1, zx2));

    }
}