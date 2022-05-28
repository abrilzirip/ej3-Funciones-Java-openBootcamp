public class Main {
    public static void main(String[] args) {
        int resultado = funcion(10, 5, 15);

        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.cantidadPuertas = 1;

        System.out.println("La cantidad de puertas del coche es: " + miCoche.cantidadPuertas);
    }

    public static int funcion(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int cantidadPuertas = 0;

    public void IncrementarPuerta() { this.cantidadPuertas--;}
}