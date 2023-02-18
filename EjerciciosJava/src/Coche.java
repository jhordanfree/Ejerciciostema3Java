
public class Coche {     // Definimos la clase Coche
    private int numPuertas;
    
    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    public void agregarPuerta() { // Definimos una función que incrementa el número de puertas
        numPuertas++;
    }
    
    public int getNumPuertas() {// Definimos una función para obtener el número actual de puertas
        return numPuertas;
    }
}


