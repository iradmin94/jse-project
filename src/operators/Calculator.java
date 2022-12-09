package operators;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2, result;
        char operator;
//        double pow;

        Scanner input = new Scanner(System.in);
        System.out.println("Number 1");
        num1 = input.nextInt();
        System.out.println("Number 2");
        num2 = input.nextInt();

        System.out.println("Choose an operator: +, -, *, /, pow ");
        operator = input.next().charAt(0);
//        pow = Double.parseDouble(input.next());

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;
//            case "pow":
//                System.out.println(Math.pow(num1, num2));
            default:
                System.out.println("Invalid operator");
        }
        input.close();


    }
}
//        result = num1+num2;
//        System.out.printf("%d + %d = %d\n", num1, num2,result);
//        result = num1-num2;
//        System.out.printf("%d - %d = %d\n", num1, num2,result);
//        result = num1 / num2;
//        System.out.printf("%d / %d = %d\n", num1, num2,result);
//        result = num1 * num2;
//        System.out.printf("%d * %d = %d\n", num1, num2,result);
//        System.out.println(Math.pow(num1,num2));



