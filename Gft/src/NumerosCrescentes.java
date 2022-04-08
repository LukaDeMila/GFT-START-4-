import java.util.Arrays;
import java.util.Scanner;

public class NumerosCrescentes {
	
	
public static void main(String[] args) {

	Scanner valores = new Scanner(System.in);
	int[] listaDeValores = new int[4];
	           
	for (int i = 1; i < listaDeValores.length; i++) {
	System.out.print("Digite "+ i + "° numeros: "); 
	listaDeValores[i] = (valores.nextInt());
		           }
		Arrays.sort(listaDeValores);
	System.out.print("Ordem crescente:    "); 
	 for (int j = 1; j < listaDeValores.length; j++) {
	System.out.print(listaDeValores[j]+ "  ");       		
			  }
	 }
	}

