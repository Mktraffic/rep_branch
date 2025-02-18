import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Calculator cl = new Calculator();
        int op = 0;
        do{
            System.out.println(cl.function());
            System.out.println("Desea volver a usar la calculadora?\n1.Si\n2. No, salir");
            op = sc1.nextInt();
        }while(op != 2);

    }


    public String function () {

        double result = 0;
        int operation = 0;

        do{
        System.out.println("Ingrese el primer numero");
        double firstNumber = sc.nextDouble();

        System.out.println("Ingrese el segundo Numero");
        double secondNumber = sc.nextDouble();

        System.out.println("Ingrese el numero de la operacion a realizar: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. salir");
        operation = sc.nextInt();

        if (operation > 0 || operation <= 5) {
            switch (operation) {
                case 1:
                    result = firstNumber + secondNumber;
                    break;
    
                case 2:
                    result = firstNumber - secondNumber;
                    break;
    
                case 3:
                    result = firstNumber * secondNumber;
                    break;
    
                case 4:
                    if (secondNumber != 0) {
                        result = firstNumber/secondNumber;
                    }else{
                        System.out.println("No se pueden realizar divisiones por 0");
                    }
                    break;
                
                case 5:
                    System.out.println("Fin del programa");
                    break;
            }
        } else {
            System.out.println("Ingrese una operacion valida");        
        }
        } while(operation < 0 || operation > 6);
        
        return "Su resultado es: " + result;

    }

}