package calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        double firstValue;
        char operation;
        double secondValue;
        double thirdValue;

        double ans = 0;
        while (true){
            Scanner read = new Scanner(System.in);
            firstValue = read.nextDouble();
            operation = read.next().charAt(0);
            secondValue = read.nextDouble();

            switch (operation) {
                case '+':
                    ans = firstValue + secondValue;
                    break;
                case '-':
                    ans = firstValue - secondValue;
                    break;
                case '/':
                    ans = firstValue / secondValue;
                    break;
                case '*':
                    ans = firstValue * secondValue;
                default:
                    System.out.println("Неверный оператор");
                    return;
            }
            System.out.println(ans);

        }
        }

    }

