package application;
import java.util.Locale;
import java.util.*;
import entities.Method;
public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Method Met;
		
		System.out.println("Enter product name: ");
		String name =sc.next();
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println("Amount In Stock: " );
		int qtd=sc.nextInt();
		
		Met = new Method(name, price, qtd); 
		
		System.out.println("Data  " + Met);
		
		
		System.out.println("Insert a quatity to sell: ");
		 double sold = sc.nextInt();
		 
		 
		
		System.out.println("Updated data:");
		System.out.println(Met.setBuy(sold));
		
		
		
		
		sc.close();
		
		
	}

}
