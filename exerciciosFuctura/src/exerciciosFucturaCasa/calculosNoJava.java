package exerciciosFucturaCasa;

import java.util.Scanner;

public class CalculosNoJava {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Agora digite outro numero: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		int subtra��o = numero1 - numero2;
		int divis�o = numero1  / numero2;
		int multiplica��o = numero1 * numero2;
		
		System.out.println("A soma dos 2 numeros digitados � igual � " + soma);
		System.out.println("A subtra��o dos 2 numeros digitados � igual � " + subtra��o);
		System.out.println("A divis�o dos 2 numeros digitados � igual � " + divis�o);
		System.out.println("A multiplica��o dos 2 numeros digitados � igual � " + multiplica��o);
		
	}
}
