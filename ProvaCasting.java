package base;

public class ProvaCasting {

	public static void main(String[] args) {
		double numero = 5.7;
		double d = 2*numero;
		System.out.println("doppio reale prima del casting: " + d);
		//casting da double a int
		int doppio = (int) d;
		System.out.println(doppio);
		//con una espressione devo 
		//mettere le parentesi tonde
		//all'espressione
		int triplo = (int) (3*numero);
		System.out.println(triplo);
	}

}
