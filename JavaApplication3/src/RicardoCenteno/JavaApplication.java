package RicardoCenteno;
import java.util.*;
public class JavaApplication {

    public static void main(String[] args) {     
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Selecciona un ejercicio del 1 al 13 o 14 para salir");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Programa que escriba los valores comprendidos entres dos números dados.");
                ejercicio1(teclado);
                break;
            case 2:
                System.out.println("Escribir un programa que escriba por pantalla los veinte primeros múltiplos de cinco.");
                ejercicio2(teclado);
                break;
            case 3:
                System.out.println("Escribir la media de 15 valores suministrados por el teclado.");
                ejercicio3(teclado);
                break;
            case 4:
                System.out.println("Escribir la media de n valores suministrados por teclado suministrando a su vez el valor por teclado.");
                ejercicio4(teclado);
                break;
            case 5:
                System.out.println("Programa que recibe una cantidad horaria en horas, minutos y segundos y lo convierte todo a minutos.");
                ejercicio5(teclado);
                break;
            case 6:
                System.out.println("Programa que recibe una cantidad horaria en segundos y la convierte en horas, minutos segundos.");
                ejercicio6(teclado);
                break;
            case 7:
                System.out.println("Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor de ellos.");
                ejercicio7(teclado);
                break;
            case 8:
                System.out.println("Escribir un programa que calcule el factorial de un número pedido por teclado");
                ejercicio8(teclado);
                break;
            case 9:
                System.out.println("Escribir un programa que pida 3 números y los imprima de mayor a menor.");
                ejercicio9(teclado);
                break;
            case 10:
                System.out.println("Escribir un programa que pida una nota numérica y la saque por pantalla en letra.");
                ejercicio10(teclado);
                break;
            case 11:
                System.out.println("Escribir un programa que pida una nota numérica y ponga el equivalente en letras");
                ejercicio11(teclado);
                break;
            case 12:
                System.out.println("Un programa que pida el número de alumnos de la clase, pida la nota de todos los alumnos saque la media de la clase y el número de aprobados y suspensos.");
                ejercicio12(teclado);
                break;
            case 13:
                System.out.println("Realizar un programa que imprima todos los números primos entre 1 y n, siendo un número introducido por el usuario");
                ejercicio13(teclado);
                break;
            case 14:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");

        }
        }
        while(opcion!=14);
    }
    
    
    public static void ejercicio1(Scanner teclado){
        int num1;
        int num2;
            System.out.println("Introduce el numero menor");
            num1 = teclado.nextInt();
            System.out.println("Introduce el numero mayor");
            num2 = teclado.nextInt();
        num1++;
        num2--;
        for (int i = num1; i <= num2 ; i++){
            System.out.println(i);
        }
       
    }

    
    public static void ejercicio2(Scanner teclado){
        int multiplo;
        for (int a = 1;a<=20;a++){
            multiplo =  a*5;
            System.out.println(multiplo);
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
        System.out.println("Ingresa el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresa el segundo numero");
        int b = teclado.nextInt();
        System.out.println("Ingresa el tercer numero");
        int c = teclado.nextInt();
        if(a>b && a>c && b>c){
            System.out.println(a+","+b+","+c);}
        else if(a>b && a>c && b<c){
            System.out.println(a+","+c+","+b);}
        else if(b>a && b>c && a>c){
            System.out.println(b+","+a+","+c);}
        else if(b>a && b>c && a<c){
            System.out.println(b+","+c+","+a);}
        else if(c>a && c>b && a>b){
            System.out.println(c+","+a+","+b);}
        else if(c>a && c>b && a<b){
            System.out.println(c+","+b+","+a);}
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
        int n;
        int j;
        System.out.println("Introduce un numero para saber los numero primos "
                + "entre 1 y ese numero");
        int num=teclado.nextInt();
        for(n=2;n<=num;n++)
        {
            for(j=2;n%j!=0;j++);
            if(n==j)
                System.out.println(n);
        }
        System.out.println(); System.out.println();
    }

}
