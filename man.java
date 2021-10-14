package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operation op = null;
        roman_numerals z = null;
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        char Operation1 = in.next().charAt(0);
        int num2 = in.nextInt();
        if (Operation1 == '+')
            op = Operation.SUM;
        else if (Operation1 == '-'){
            op = Operation.SUBTRACT;
        }
        else if (Operation1 == '/'){
            op = Operation.DIVIDE;
        }
        else if (Operation1 == '*'){
            op = Operation.MULTIPLY;
        }
        z = roman_numerals.XC;
        System.out.println(z);
        System.out.println(op.action(num1, num2));
        in.close();
    }
}
enum roman_numerals{
    I(1), II(2), III(3), IV(4), V(5),VI(6), VII(7), VIII(8), IX(9), X(10), XX(20),
    XXX(30), XL(40), L(50), XC(90), C(100);
    private int code;
    roman_numerals(int code) {
        this.code = code;
    }
    public int getCode(int code){ return code;}
}

enum Operation{
    SUM{
        public int action(int x, int y){ return x + y;}
    },
    SUBTRACT{
        public int action(int x, int y){ return x - y;}
    },
    MULTIPLY{
        public int action(int x, int y){ return x * y;}
    },
    DIVIDE{
        public int action(int x, int y){ return x / y;}
    };
    public abstract int action(int x, int y);
}

