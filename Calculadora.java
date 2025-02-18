/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gabdi
 */
public class Calculadora {
    
    private Scanner scan;

    public Calculadora() {
        scan = new Scanner(System.in);
        inIt();
    }
    public void inIt(){
        System.out.println("Ingrese una opcion para la calculadora\n"
                + "1. Suma\n"
                + "2.Resta\n"
                + "3. multiplicacion\n"
                + "4. Division\n"
                + "5. Salir"
        );
        int option = scan.nextInt();
        
        switch (option) {
            case 1 -> {
                System.out.println("Ingrese los dos numeros");
                System.out.println("El resultado es:" + suma(scan.nextInt(), scan.nextInt()));
                inIt();
            }
            case 2 -> {
                System.out.println("Ingrese los dos numeros");
                System.out.println("El resultado es:" + resta(scan.nextInt(), scan.nextInt()));
                inIt();
            }
            case 3 -> { 
                System.out.println("Ingrese los dos numeros");
                System.out.println("El resultado es:" + multiplicacion(scan.nextInt(), scan.nextInt()));
                inIt();
            }
            case 4 -> {
                System.out.println("Ingrese los dos numeros");
               try {
                System.out.println("El resultado es:" + division(scan.nextInt(), scan.nextInt()));
                } catch (Exception e) {
                 System.out.println("Ingrese un numero en el divisor diferente de 0");
                 }
                inIt();
            }
            case 5 -> {
               
            }
            
            
                   
            default -> throw new AssertionError();
    }
    }
    public float suma(int numONeIn,int numTwo){
        float result = 0;
        result = numONeIn + numTwo;
        return result;
        
    }
    public float resta(int numONeIn,int numTwo){
        float result = 0;
        result = numONeIn - numTwo;
        return result;
        
    }
    public float multiplicacion(int numONeIn,int numTwo){
        float result = 0;
        result = numONeIn * numTwo;
        return result;
        
    }

    public float division(int numONeIn,int numTwo){
        float result = 0;
             result = numONeIn / numTwo;
        return result;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora cal = new Calculadora();
        
    }
}
