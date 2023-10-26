package Calculat;
public class CalcException extends Exception {
    public CalcException() {
        System.out.println("Выражение задано ошибочно!");
    }
    public CalcException(String message){
        this();
        System.out.println(message);
    }
}
