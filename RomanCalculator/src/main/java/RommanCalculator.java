/**
 * Created by Dojo on 5/19/15.
 */
public class RommanCalculator {
    public String sum(String var1, String var2) {
        String sum = var1 + var2;

        sum = translateResult(sum);

        return sum;
    }

    private String translateResult(String var) {

        if (containsTimesInARow(var, 5, "I")) {
            return var.replace("IIIII", "V");
        }
        else if (containsTimesInARow(var, 5, "C")) {
            return var.replace("CCCCC", "D");
        }
        else if (containsTimesInARow(var, 5, "X")) {
            return var.replace("XXXXX", "L");
        }
        else if (containsTimesInARow(var, 4, "I")) {
            return var.replace("IIII", "IV");
        }
        else if (containsTimesInARow(var, 4, "X")) {
            return var.replace("XXXX", "XL");
        }
        else if (containsTimesInARow(var, 4, "C")) {
            return var.replace("CCCC", "CD");
        }
        else if (containsTimesInARow(var, 2, "V")){
            return var.replace("VV", "X");
        }
        else if (containsTimesInARow(var, 2, "L")){
            return var.replace("LL","C");
        }
        else if (containsTimesInARow(var, 2, "D")){
            return var.replace("DD","M");
        }

        return var;

    }

    private boolean containsTimesInARow(String var, int number, String character){
        String row = "";
        for(int index = 0; index < number; index++){
            row += character;
        }
        if(var.contains(row)){
            return true;
        }
        return false;
    }

  /*  private String groupChars(String var){
        String aux = "";

        for(int i = 0; i < var.length()){

        }
    }*/

}
