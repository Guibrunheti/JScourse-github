package application;
import java.util.*;
import java.util.Locale;

public class vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor ");
		
		int n = sc.nextInt();
		double [] vet =  new double [n];
		
		for (int i= 0; i<n;i++ ) {
			vet[i] = sc.nextDouble();
			
		}
		
		double som =0;
		for (int i = 0;i<n;i++) {
			som += vet[i];
		}
		
		double med = som / n;
		
		System.out.printf("%.2f %n", med);
		
		sc.close();
	}

}
