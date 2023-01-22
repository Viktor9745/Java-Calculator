package calculatorm;

import java.util.HashMap;
import java.util.Map;

class Parse {
    private final Map<String, Integer> romeArabMap = new HashMap<>();

    private final int[] arabDigit = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    private final String[] romeDigit = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    
    public Parse() {
        romeArabMap.put("I", 1);
        romeArabMap.put("II", 2);
        romeArabMap.put("III", 3);
        romeArabMap.put("IV", 4);
        romeArabMap.put("V", 5);
        romeArabMap.put("VI", 6);
        romeArabMap.put("VII", 7);
        romeArabMap.put("VIII", 8);
        romeArabMap.put("IX", 9);
        romeArabMap.put("X", 10);
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }   

    public boolean isRoman(String str) {
        return romeArabMap.containsKey(str);
    }
    public Integer romeToArabConvert(String st){
        if (romeArabMap.containsKey(st)){
            return romeArabMap.get(st);
        }
        return null;
    }

    public String arabToRomeConvert(Integer num){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<arabDigit.length; i++){
            while((num - arabDigit[i])>=0){
                num -= arabDigit[i];
                result.append(romeDigit[i]);
            }
        }
        return result.toString();
    }
    public boolean checkOperator(String op){
        return "*".equals(op) || "/".equals(op) || "+".equals(op) || "-".equals(op);
    }
    
}
