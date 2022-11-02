package main;

import java.util.Scanner;
import main.funcions.*;

public class Main{
    public static void main(String[] args){

        Functions fc = new Functions();
        Scanner sc = new Scanner(System.in);

        int a, b, op;

        System.out.println("Introduzca el primer número: ");
        a = sc.nextInt();

        System.out.println("Introduzca el segundo número: ");
        b = sc.nextInt();

        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. División.");
        System.out.println("¿Qué operación desea realizar?:");
        op = sc.nextInt();

        sc.close();

        System.out.print("El resultado es: ");

        switch (op) {
            case 1:
                System.out.println(fc.Suma(a,b));
                break;

            case 2:
                System.out.println(fc.Resta(a,b));
                break;

            case 3:
                System.out.println(fc.Multi(a, b));
                break;

            case 4:
                System.out.println(fc.Division(a, b));
                break;
        
            default:
                break;
        }

    }
}
