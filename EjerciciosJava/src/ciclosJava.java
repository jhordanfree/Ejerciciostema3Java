
public class ciclosJava {
	

    public static void main(String[] args) {
        // Usando un if, comparar si la variable numeroIf es positivo, negativo o 0.
        int numeroIf = -3;
        System.out.println("El resultado del ciclo if es que : ");
        if (numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es 0");
        }
        System.out.println("\t");
        
        // Bucle While
        System.out.println("El resultado del ciclo while es: ");
        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println("\t");
        
        // Bucle Do While
        int numeroDoWhile = 0;
        System.out.println("El resultado del ciclo do while es: ");
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
        System.out.println("\t");
        
        // Bucle For
        System.out.println("El resultado del ciclo for es: ");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("\t");
        
        // Switch
        System.out.println("El resultado del switch es que : ");
        String estacion = "verano";
        switch (estacion) {
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("No es una estación del año válida");
        }
    }

}
