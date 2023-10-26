package Calculat;

public class Exa {
    public boolean isNumeric(String str) {
       try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean checkZnak(String vyr){
        return "*".equals(vyr) || "/".equals(vyr) || "+".equals(vyr) || "-".equals(vyr);
    }
}