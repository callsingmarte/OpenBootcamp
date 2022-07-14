package EjerciciosTema4;

public class Main {
    public static void main(String[] ags) {
        int numeroIf = 0;
        if(numeroIf < 0){
            System.out.println("Numero negativo");
        }else if(numeroIf > 0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("El numero es cero");
        }

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile  = numeroWhile + 1;
            System.out.println("Numero while: " + numeroWhile);
        }

        int numeroDoWhile = 2;
        do{
            numeroDoWhile += 1;
            System.out.println("Numero do while: " + numeroDoWhile);
        }while(numeroDoWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero for: " + numeroFor);
        }

        String estacion = "OTOÑO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("INVIERNO");
                break;
            default:
                System.out.println("El valor no es una estacion");
                break;
        }
    }
}
