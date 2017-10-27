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
        minutos = teclado.nextInt();
        double segundos;
        System.out.println("Ingresa un numero de segundos");
        segundos = teclado.nextInt();
        
        int horasenminutos = horas * 60;
        int minutosenminutos = minutos;
        double segundosenminutos = segundos/60;
        
        double acum = horasenminutos + minutosenminutos + segundosenminutos;
        
        System.out.println("En minutos son "+acum);
             
    }
    
    
    public static void ejercicio6(Scanner teclado){
        int num;
        int horas;
        int minutos;
        int segundos;
                
        System.out.println("Ingresa un numero de segundos");
        num = teclado.nextInt();
        horas = num/3600;
        minutos=(num-(3600*horas))/60;
        segundos=num-((horas*3600)+(minutos*60));
        System.out.println("Son "+horas+" horas, "+minutos+" minutos "+segundos+" segundos");      
    }
    
    
    public static void ejercicio7(Scanner teclado){
        int num;
        int cont=10;
        int mayor;
        int menor;
        
        System.out.println("Ingresa un numero");
            num = teclado.nextInt();
            menor=num;
            mayor=num;
        for(int a = 1 ; a < cont ; a++){
            System.out.println("Ingresa un numero");
            num = teclado.nextInt();
        if(num>mayor){
            mayor=num;}
        else if(num<menor){
                menor=num;}
                                   }
        System.out.println("El numero mayor es "+mayor+" y el menor es "+menor);
    }
    
    
    public static void ejercicio8(Scanner teclado){
        int num;
        int factorial = 1;
        
        System.out.println("Ingresa un numero para calcular su factorial");
        num = teclado.nextInt();
        for (int a = 1 ; a <= num ; a++){
        factorial = factorial * a;
                                    }
        System.out.println("El resultado es "+factorial);
    }
    
    
    public static void ejercicio9(Scanner teclado){
        int num;
        int mayor;
        int cont = 3;
        System.out.println("Ingresa 3 numeros");
        num = teclado.nextInt();
        mayor = num;
        for(int a = 1 ; a <cont ; a++){
            System.out.println("Ingresa 3 numeros");
            num = teclado.nextInt();  
        if(mayor >= num){
            System.out.println("");
            }
                              }
    }
    
    
    public static void ejercicio10(Scanner teclado){
        int num;
        System.out.println("Ingresa una nota numerica");
        num = teclado.nextInt();
        switch (num) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Ingresa una nota valida, melon");
                break;
        }

    }
    
    
    public static void ejercicio11(Scanner teclado){
        int num;
        System.out.println("Ingresa una nota");
        num = teclado.nextInt();
        if (num>=0 && num<5){
            System.out.println("INSUFICIENTE");}
        else if (num == 5){
            System.out.println("SUFICIENTE");}
        else if (num == 6){
            System.out.println("BIEN");}
        else if (num == 7 || num == 8){
            System.out.println("NOTABLE");}
        else if (num == 9 || num == 10){
            System.out.println("SOBRESALIENTE");}
        else {
            System.out.println("Mete una nota valida, melon");}
        
    }
    
    
    public static void ejercicio12(Scanner teclado){
        double num;
        double acum = 0;
        double nota;
        double media;
        int suspensos = 0;
        int aprobados = 0;
        
        System.out.println("Numero de alumnos");
        num = teclado.nextInt();
        for(int a = 0; a < num ; a++){
            System.out.println("Ingrese la nota");
            nota = teclado.nextInt();
            acum = acum + nota;
            if (nota>=0 && nota<5){
                suspensos++;
            }
            else if (nota >= 5 && nota<=10){
                aprobados++;
            }

                                    }
        media = acum / num;
        System.out.println("La media es "+media+", el numero de aprobados fueron "+aprobados+" y el numero de suspensos fueron "+suspensos+".");
        
    }
    
    
    public static void ejercicio13(Scanner teclado){

    }
    
}