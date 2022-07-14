package EjerciciosTema3;

public class Main {
    public static void main(String[] args) {
        suma(10, 20, 30);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Numero de puertas: " + miCoche.puertas);
    }

    private static void suma(int a, int b, int c){
        int suma =  a + b + c;
        System.out.println("Suma: " + suma);
    }
}
class Coche {
    int puertas = 2;

    public void incrementarPuertas (){
        this.puertas++;
    }
}