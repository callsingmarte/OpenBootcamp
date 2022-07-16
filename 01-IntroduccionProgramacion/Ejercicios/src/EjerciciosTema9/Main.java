package EjercicioTema9;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.nombre = "Jhon";
        cliente.edad = 20;
        cliente.telefono = "+1024852654";
        cliente.credito = 59.6;

        System.out.println("-----------------------------------------");
        System.out.println("Datos de cliente");
        System.out.println("-----------------------------------------");
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Telefono: " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Paco";
        trabajador.edad = 40;
        trabajador.telefono = "+34526145987";
        trabajador.salario = 2500;

        System.out.println("-----------------------------------------");
        System.out.println("Datos de trabajador");
        System.out.println("-----------------------------------------");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}