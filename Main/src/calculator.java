import java.util.Objects;
import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        Scanner jkl = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = jkl.nextInt();
        System.out.println("Введите число: ");
        int b = jkl.nextInt();
        System.out.println("Введите операцию:");
        String operator = jkl.next();

        if (Objects.equals(operator, "+"))
        {
            plus(a, b);
        }
        else if (Objects.equals(operator, "-"))
        {
            minus(a, b);
        }
        else if (Objects.equals(operator, "/"))
        {
            delen(a, b);
        }
        else if (Objects.equals(operator, "*"))
        {
            ymnosh(a, b);
        }
        else
        {
            System.out.println("ошибка!");
        }


    }

    private static void ymnosh(int a, int b)
    {
        System.out.println("Результат: " + a * b);
    }

    private static void delen(int a, int b)
    {
        if (b  != 0)
        {
            System.out.println("Результат: " + a / b);
        }
        else
        {
            System.out.println("Ошибка! Деление на ноль.");
        }
    }

    private static void minus(int  a, int  b)
    {
        System.out.println("Результат: " + (a - b));
    }

    private static void plus(int  a, int  b)
    {
        System.out.println("Результат: " + (a + b));
    }


}
