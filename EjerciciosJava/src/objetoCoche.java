
public class objetoCoche {
	public static void main(String[] args) {
	    Coche miCoche = new Coche(3);
	    miCoche.agregarPuerta();
	    System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
	}
}
