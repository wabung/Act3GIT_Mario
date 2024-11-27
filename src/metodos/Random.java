package metodos;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				int nElementos = 30;
				double[] arrayAzul = new double[nElementos];
				
				for(int i=0; i<nElementos; i++) {
					arrayAzul[i] = Math.random()*10;
					arrayAzul[i] *= 10;
					arrayAzul[i] = (int) arrayAzul[i];
					arrayAzul[i] = arrayAzul[i]/10.0;
						
					System.out.println(arrayAzul[i] + " y posicionnnnnn " + i);
		}
				System.out.println("\nNúmeros en orden inverso:");
		        for (int i = nElementos - 1; i >= 0; i--) {
		            System.out.println(arrayAzul[i] + " y posicionnnnnn " + i);
		        }
	}
}
