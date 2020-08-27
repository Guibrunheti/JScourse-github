package application;
import java.util.Scanner;
import entities.Aluguel;
public class Room {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		Aluguel[] vet = new Aluguel[10];
		
		System.out.println("how many rooms will b rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n ; i++) {
			System.out.println();
			System.out.println("Rent " + i + ": ");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int room = sc.nextInt();
			vet[room]= new Aluguel(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i =0 ; i<10; i++) {
			if(vet[i] != null) {
				System.out.println(i + ":" + vet[i]);
			}
		}
		
		sc.close();

	}

}
