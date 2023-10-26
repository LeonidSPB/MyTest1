package Calculat;

import java.util.Arrays;
import java.util.List;
public class Calc {
    private int c1, c2;
    private String znak;

    private int calcExp(int v1, String vyr, int v2){
        int itog;
        switch (vyr) {
            case "*":
                itog = v1*v2;
                break;
            case "/":
                itog = v1/v2;
                break;
            case "+":
                itog = v1+v2;
                break;
            case "-":
                itog = v1-v2;
                break;
            default:
                throw new AssertionError();
        }
        return itog;
    }

    public String result(String exp) throws CalcException{
        Exa exa = new Exa();


        List<String> expItems = Arrays.asList(exp.split(" "));

        if (expItems.size()!=3){
            throw new CalcException("ОШИБКА! Вводимое выражение должно иметь вид: \"Число1 Операция Число2\", значения разделенны пробелом...");
        }

        if (exa.checkZnak(expItems.get(1))){
            znak = expItems.get(1);
        } else {
            throw new CalcException("ОШИБКА! Оператор '" + expItems.get(1) + "' не корректен, должен быть один из операторов: + - * / ");
        }

        if (exa.isNumeric(expItems.get(0)) && exa.isNumeric(expItems.get(2))){
            c1 = Integer.parseInt(expItems.get(0));
            c2 = Integer.parseInt(expItems.get(2));
        } else {
            throw new CalcException("ОШИБКА ВВОДА");
        }

        if (!(c1>=1 && c1<=10)){
            throw new CalcException("ОШИБКА! Первое число должно быть от 1 до 10 включительно");
        }
        if (!(c2>=1 && c2<=10)){
            throw new CalcException("ОШИБКА! Второе число должно быть от 1 до 10 включительно");
        }

        int itog = calcExp(c1, znak, c2);
        return String.valueOf(itog);
    }
}
