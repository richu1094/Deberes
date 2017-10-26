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
                ejercicio2(teclado);
                break;
            case 3:
                ejercicio3(teclado);
                break;
            case 4:
                ejercicio4(teclado);
                break;
            case 5:
                ejercicio5(teclado);
                break;
            case 6:
                ejercicio6(teclado);
                break;
            case 7:
                ejercicio7(teclado);
                break;
            case 8:
                ejercicio8(teclado);
                break;
            case 9:
                ejercicio9(teclado);
                break;
            case 10:
                ejercicio10(teclado);
                break;
            case 11:
                ejercicio11(teclado);
                break;
            case 12:
                ejercicio12(teclado);
                break;
            case 13:
                ejercicio13(teclado);
                break;
            default:
                System.out.println("opcion no valida");

        }
    }
    
    
    public static void ejercicio1(Scanner teclado){
        int num1,num2;
            System.out.println("Introduce el numero menor");
            num1 = teclado.nextInt();
            System.out.println("Introduce el numero mayor");
            num2 = teclado.nextInt();
        for (int i = num1;i<num2;i++){
            System.out.print(i+" ");
        }
       
    }

    
    public static void ejercicio2(Scanner teclado){
        int multiplo;
        for (int a = 0;a<=20;a++){
            multiplo =  a*5;
            System.out.print(multiplo+" ");
        }
        
    }
    
    
    public static void ejercicio3(Scanner teclado){
        int num = 15;
        double acum = 0;
        double media;
        
        for (int a = 0; a < num;a++ ){
            System.out.println("Ingresa un numero para calcular la media");
            int b = teclado.nextInt();
            acum = acum + b;         
        }
            media = acum/15;
            System.out.println("La media es "+media);
    }
    
    
    public static void ejercicio4(Scanner teclado){
        int num;
        double acum = 0;
        double media;
        System.out.println("De cuantos numeros deseas calcular la media");
        num = teclado.nextInt();
        for (int a = 0; a < num; a++){
            System.out.println("Ingresa un numero para calcular la media");
            int b = teclado.nextInt();
            acum = acum + b;       
        }
            media = acum/num;
            System.out.println("La media es "+media);
    }
    
    
    public static void ejercicio5(Scanner teclado){
        int horas;
        System.out.println("Ingresa un numero de horas");
        horas = teclado.nextInt();
        int minutos;
        System.out.println("Ingresa un numero de minutos");
        horas = teclado.nextInt();
        int segundos;
        System.out.println("Ingresa un numero de segundos");
        horas = teclado.nextInt();
            
        
        
    }
    
    
    public static void ejercicio6(Scanner teclado){
        int num;
        System.out.println("Ingresa un numero de segundos");
        num = teclado.nextInt();
        int horas = num/3600;
        int minutos=(num-(3600*horas))/60;
        int segundos=num-((horas*3600)+(minutos*60));
        System.out.println("Son "+horas+" horas, "+minutos+" minutos "+segundos+" segundos");      
    }
    
    
    public static void ejercicio7(Scanner teclado){
        int num;
        int cont=10;
        int mayor;
        for(int a=0 ; a<cont ; a++){
            System.out.println("Ingresa un numero");
            num = teclado.nextInt();
            mayor = 
            
        }
    }
    
    
    public static void ejercicio8(Scanner teclado){

    }
    
    
    public static void ejercicio9(Scanner teclado){

    }
    
    
    public static void ejercicio10(Scanner teclado){

    }
    
    
    public static void ejercicio11(Scanner teclado){

    }
    
    
    public static void ejercicio12(Scanner teclado){

    }
    
    
    public static void ejercicio13(Scanner teclado){

    }
    
}