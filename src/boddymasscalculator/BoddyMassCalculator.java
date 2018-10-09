/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boddymasscalculator;

/**
 *
 * @author charuni
 */import java.util.Scanner;
public class BoddyMassCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter your weight in Kg");
        double n=input.nextDouble();
        System.out.println("Enter your height in m");
        double m=input.nextDouble();
        
        double BMI=n/(m*m);
        System.out.println("Your BMI is"+BMI);
        if(BMI<18.5){
            System.out.println("Thin");
        }
        else if(BMI>=18.6&&BMI<=24.9){
            System.out.println("Healthy");
        }
        else if(BMI>=25&&BMI<=29.9){
            System.out.println("Overweight");
        }
        else if(BMI>30){
            System.out.println("Obese");
        }
    
    }
}