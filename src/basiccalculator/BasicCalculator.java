/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccalculator;

import java.util.Scanner;

/**
 *
 * @author ulisses
 */
public class BasicCalculator {


    public static void main(String[] args) {
        inputMath();
    }
    
    public static void inputMath(){
        Scanner input = new Scanner(System.in);
        float num1;
        float num2;
        String ope;
        float result;
        
        System.out.println("Type a number: ");
        num1 = input.nextFloat();
        
        System.out.println("Type a math operation ( +, -, *, /)");
        ope = input.next();
        
        System.out.println("Type a number");
        num2 = input.nextFloat();
        
        System.out.println("Result: " + calculator(num1, ope, num2));
    }
    
    public static float calculator(float num1, String op, float num2){

        int typeOp = verifyOperation(op);
        
        switch(typeOp){
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3: 
                return num1 * num2;
            case 4: 
                return num1 / num2;
            default:
                return -1;
        }
    } 
    
    public static int verifyOperation(String op){

        switch (op) {
        case "+":
            return 1;
        case "-":
            return 2;
        case "*":
            return 3;
        case "/":
            return 4;
        default:
            System.err.println("Invalid Operation, wrong answer, try again !");
            return -1;
        }
    }
}
