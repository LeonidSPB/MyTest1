package Calculat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorM {

    public static void main(String[] args) {
        try{
            System.out.println("Формат ввода значений в калькулятор: \"Число1 Операция Число2\", ввод через пробел. Допускаются числа от 1 до 10 включительно. Операции: + - * /");
            System.out.print("Введите выражение: ");
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            String calcString = bReader.readLine();

            Calc calc = new Calc();
            String result = calc.result(calcString);
            System.out.println("Ответ: " + result);
        }
        catch(CalcException | IOException e){
            System.out.println();
        }
    }
}
