package javaapplication3;
import java.util.*;
public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona un ejercicio del 1 al 13");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(teclado);
                break;
            case 2:
                ejercicio2();
                break;
            case 3:
                ejercicio3();
                break;
            case 4:
                ejercicio4();
                break;
            case 5:
                ejercicio5();
                break;
            case 6:
                ejercicio6();
                break;
            case 7:
                ejercicio7();
                break;
            case 8:
                ejercicio8();
                break;
            case 9:
                ejercicio9();
                break;
            case 10:
                ejercicio10();
                break;
            case 11:
                ejercicio11();
                break;
            case 12:
                ejercicio12();
                break;
            case 13:
                ejercicio13();
                break;
            default:
                System.out.println("opcion no valida");

        }
    }
    
    
    
    public static void ejercicio1(Scanner teclado){
    int num1,num2;
        System.out.println("Introduce un numero aleatorio");
        num1 = teclado.nextInt();
        System.out.println("Introduce otro numero aleatorio");
        num2 = teclado.nextInt();
    while (num1<num2) {num1 = num1+ 1;
            System.out.println (num2);
        } 
       
    }

    
    public static void ejercicio2(){

    }
    
    
    public static void ejercicio3(){

    }
    
    
    public static void ejercicio4(){

    }
    
    
    public static void ejercicio5(){

    }
    
    
    public static void ejercicio6(){

    }
    
    
    public static void ejercicio7(){

    }
    
    
    public static void ejercicio8(){

    }
    
    
    public static void ejercicio9(){

    }
    
    
    public static void ejercicio10(){

    }
    
    
    public static void ejercicio11(){

    }
    
    
    public static void ejercicio12(){

    }
    
    
    public static void ejercicio13(){

    }
    
}