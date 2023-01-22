// https://jm-program.github.io/task-calculator
// Тестовое задание калькулятор Java

package calculatorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CalculatorM {

    public static void main(String[] args) {
        try{
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            String calcString = bReader.readLine();
            
            Calc calc = new Calc();
            String result = calc.result(calcString);
            System.out.println(result);
        } 
        catch(CalcException | IOException e){
            
        }

    }
    
}
