package proyecto_git;

public class proyecto1 {

	public static void main(String[] args) {
		
		int[] arrayNumeros = new int [30];
		for(int i = 0; i<arrayNumeros.length; i++) {
			int numeroRandom = (int) (Math.random()*10);
		System.out.println(i + ":" + numeroRandom);
		}
		}
}
