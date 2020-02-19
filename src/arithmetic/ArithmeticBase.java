/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import arithmetic.ArithmeticBase.Operator;

/**
 * This class takes String input plus,minus,divide and times from user and
 * execute the arithmetic operation change the code to use enum instead String
 * and add object oriented principles satisfy as comment in the code
 *
 * @author sivagamasrinivasan date 02/19
 * Christian Tapnio 991359879
 */
public class ArithmeticBase {

    public double x, y;
    public int z;
    
    public enum Operator {
        PLUS, MINUS, TIMES, DIVIDE
    };
    
    Operator assign(int z){
        Operator operator = null;
        switch (z){
            case 1: return operator.PLUS;
            case 2: return operator.MINUS;
            case 3: return operator.TIMES;
            case 4: return operator.DIVIDE;
        }
        return operator;
    }
    
    double calculate(double x, double y, Operator operator) {
     
        switch (operator) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
        
    }

}
