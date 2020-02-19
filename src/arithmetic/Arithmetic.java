/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import arithmetic.ArithmeticBase.Operator;
import static java.lang.String.valueOf;
import java.util.Scanner;

/**
 * This class calls the method to perform arithmetic operations based on user
 * input execute the code check the output
 *
 * @author sivagamasrinivasan date 02/19
 * Christian Tapnio - 991359879
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an integer for one of the following "
                + "arithmetic operators:\n1.PLUS\n2.MINUS\n3.TIMES\n4.DIVIDE");
        int entry = sc.nextInt();
        
        
        ArithmeticBase r = new ArithmeticBase();
       
        Operator operator =  r.assign(entry);
        double result = r.calculate(1, 2, operator);
        System.out.println("result :" + result);

    }

}
