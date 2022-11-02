package main;

import java.util.Scanner;

public class Main{

    static int Suma(int a, int b){
        return a + b;
    }

    static int Resta (int a, int b){
        return a - b;
    }

    static int Multi (int a, int b){
        return a * b;
    }

    static double Division (int a, int b){
        return (double)a / (double)b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, op;

        System.out.println("Introduzca el primer número: ");
        a = sc.nextInt();

        System.out.println("Introduzca el segundo número: ");
        b = sc.nextInt();

        System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. División.");
        System.out.println("¿Qué operación desea realizar?:");
        op = sc.nextInt();

        System.out.print("El resultado es: ");

        switch (op) {
            case 1:
                System.out.println(Suma(a,b));
                break;

            case 2:
                System.out.println(Resta(a,b));
                break;

            case 3:
                System.out.println(Multi(a, b));
                break;

            case 4:
                System.out.println(Division(a, b));
                break;
        
            default:
                break;
        }

    }
}
