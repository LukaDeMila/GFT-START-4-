import java.util.Scanner;

public class Aluno {
	int matricula;
	static double nota1;
	static double nota2;
	static double nota3;
	int frequencia;
	
	public static Scanner keyboard = new Scanner(System.in);
			
			
	public static void main(String[] args, Object media) {
	
	System.out.println("DIGITE A PRIMEIRA : ");
	nota1 = Double.parseDouble( Keyboard.nextline());
	
	System.out.println(" DIGITE A SEGUNDA NOTA: ");
	nota2 = Double.parseDouble(Keyboard.nextline ());
	
	System.out.println(" DIGITE A TERCEIRA NOTA: ");
	nota3 = Double.parseDouble(Keyboard.nextline ());
	
	
	// atribuindo o resultado do calculo da media
	media = (nota1 nota2 nota3)/3
	System.out.println("A media das notas é: " + media); // concatenação
			
	}
	

}
