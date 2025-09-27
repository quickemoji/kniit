import java.util.Scanner;

class Calculator  {

    static String input()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("exit"))
        {
            System.out.println("Выход из программы.");
            System.exit(0);
        }
        return s;
    }

    static double add(double a, double b)
    {
        return a + b;
    }

    static double subtract(double a, double b)
    {
        return a - b;
    }

    static double multiply(double a, double b)
    {
        return a * b;
    }

    static double divide(double a, double b)
    {
        if (b == 0)
        {
            throw new ArithmeticException();
        }
        return a / b;
    }
}


public class Main {
    public static void main(String[] args) {
        while (true) 
        {
            try
            {
                System.out.print("Введите первое число: ");
                double a = Double.parseDouble(Calculator.input());
                System.out.print("Введите оператор (+, -, *, /): ");
                String s = Calculator.input();
                double c = 0;
                if (s.equals("+"))
                {
                    System.out.print("Введите второе число: ");
                    double b = Double.parseDouble(Calculator.input());
                    c = Calculator.add(a, b);
                }
                else if (s.equals("-"))
                {
                    System.out.print("Введите второе число: ");
                    double b = Double.parseDouble(Calculator.input()); 
                    c = Calculator.subtract(a, b);
                }
                else if (s.equals("*"))
                {
                    System.out.print("Введите второе число: ");
                    double b = Double.parseDouble(Calculator.input());
                    c = Calculator.multiply(a, b);
                }
                else if (s.equals("/"))
                {
                    System.out.print("Введите второе число: ");
                    double b = Double.parseDouble(Calculator.input());
                    c = Calculator.divide(a, b);
                }

                System.out.println("Результат: " + c);

            }
            catch (ArithmeticException e)
            {
                System.out.println("Ошибка: Деление на ноль невозможно.");
            }
        }
    }
}


