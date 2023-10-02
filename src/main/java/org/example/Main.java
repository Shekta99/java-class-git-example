package org.example;
import java.util.Scanner;

public class Main {

    public static int calcularExponencial(int base, int exponente){
        int resultado=base;
        for (int i=1; i<exponente; i++){
            resultado *=base;
        }
        return resultado;
    };

    //factorial(3) = 6
    //  6
    //          2
    //                  1
    //                          1
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Caso base: el factorial de 0 es 1
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    public static void main(String[] args) {

        System.out.println("Esto ya es un repositorio");
        int resultadoLlamadoUno = calcularExponencial(3,8);
        int resultadoLlamadoDos = calcularExponencial(2,8);
        long resultadoRecursividad = factorial(5);
        System.out.println(resultadoLlamadoUno);
        System.out.println(resultadoLlamadoDos);
        System.out.println(resultadoRecursividad);
        /*
        boolean esMayorDeEdad = true;
        int age;
        float peso =  50.87f;
        double altura = 1.5;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("Digite su edad por favor:");

        age = miScanner.nextInt();

        final int DOCUMENTO= 1234567;

        System.out.printf("%B%n",esMayorDeEdad);
        System.out.println(age);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(DOCUMENTO);

        int edad = 23;
        float edadFlotante = edad;
        edadFlotante = edadFlotante + 0.7f;
        double edadCompleta = edadFlotante;

        System.out.println(edadCompleta);
        System.out.println(edadFlotante);

        double edadCompleta = 24.7f;
        int edadEnAños = (int) edadCompleta;


        System.out.println(edadEnAños);

        int numeroUno = 8;
        int numeroDos = 3;

        System.out.println(numeroUno+ " + " + numeroDos+ " = " + (numeroUno+numeroDos));
        System.out.println(numeroUno+ " - " + numeroDos+ " = " + (numeroUno-numeroDos));
        System.out.println(numeroUno+ " * " + numeroDos+ " = " + (numeroUno*numeroDos));
        System.out.println(numeroUno+ " / " + numeroDos+ " = " + ((double) numeroUno/numeroDos));
        System.out.println(numeroUno+ " % " + numeroDos+ " = " + (numeroUno%numeroDos));

        int numeroPrueba = 5;

        numeroPrueba += 2;
        System.out.println(numeroPrueba);
        numeroPrueba -= 2;
        System.out.println(numeroPrueba);
        numeroPrueba *= 2;
        System.out.println(numeroPrueba);
        numeroPrueba /= 2;
        System.out.println(numeroPrueba);
        numeroPrueba %= 2;
        System.out.println(numeroPrueba);

        int numeroPrueba = 4;

        System.out.println(++numeroPrueba);
        System.out.println(numeroPrueba++);
        System.out.println(numeroPrueba);
        */


        /*
        int numeroUno = 5;
        int numeroDos = 5;
        if(numeroUno > numeroDos){
            System.out.println("numero uno es el mayor");
        }else if(numeroDos > numeroUno){
            System.out.println("numero dos es el mayor");
        }else{
            System.out.println("son iguales");
        }

        int numeroUno = 5;
        int numeroDos = 6;

        Scanner miScanner = new Scanner(System.in);

        System.out.println("digite el simbolo de la operación a realizar: ");

        String operacion = miScanner.nextLine();


        switch (operacion){
            case "+":
                System.out.println(numeroUno+ " + " + numeroDos+ " = " + (numeroUno+numeroDos));
                break;
            case "-":
                System.out.println(numeroUno+ " - " + numeroDos+ " = " + (numeroUno-numeroDos));
                break;
            case "*":
                System.out.println(numeroUno+ " * " + numeroDos+ " = " + (numeroUno*numeroDos));
                break;
            case "/":
                System.out.println(numeroUno+ " / " + numeroDos+ " = " + ((double)numeroUno/numeroDos));
                break;
            default:
                System.out.println("no digito una de las 4 operaciones validas");
                break;
        }


        int numeroPrueba = 6;

        String resultado = numeroPrueba == 6 ? "El numero es 6" : "El numero no es 6";

        System.out.println(resultado);


        double[] miArreglo = {2.3,4.5,7.8};
        //System.out.println(miArreglo[2]);

        for (double x : miArreglo){
            System.out.println(x);
        }

        int[][] miMatriz = {{1,5,7},{5,3,2},{8,2,1},{8,5,7},{7,3,2},{5,2,1}};
        System.out.println(miMatriz[2][0]);
        miMatriz[2][0] = 9;
        //System.out.println(miMatriz[2][0]);

        //i = 2
        //j = 1
        //fila = "5 3 2"
        for (int i = 0; i<miMatriz.length; i++){
            String fila = "";
            for(int j = 0; j<miMatriz[i].length; j++){
                fila = fila + " " + String.valueOf(miMatriz[i][j]);
            }
            System.out.println(fila);
        }

        for (int[] x : miMatriz){
            String fila = "";
            for(int y:x){
                fila+= " " + String.valueOf(y);
            }
            System.out.println(fila);
        }*/


        System.out.println("repositorio clonado");
        System.out.println("cmabio apra invertir");
    }
}