package Ejercicio1;
public class Principal {
    public static void main(String[] args) {
        Operaciones op= new Operaciones();
        System.out.println("Suma de dos numeros "+op.suma(5, 6));
        System.out.println("Resta de dos numeros "+op.suma(5, 6));
        System.out.println("Multiplicacion de dos numeros "+op.suma(5, 6));
        System.out.println("Division de dos numeros "+op.suma(8, 4));
        System.out.println("El numero mayor es: "+op.maximo(5, 8));
        System.out.println("El numero mayor es: "+op.minimo(8, 7));
        System.out.println("El numero mayor es: "+op.minimo(10, 7));
        System.out.println("El numero mayor es: "+op.minimo(20, 10));
    }
}
