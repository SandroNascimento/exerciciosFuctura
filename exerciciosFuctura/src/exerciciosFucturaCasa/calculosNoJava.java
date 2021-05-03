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
		int subtração = numero1 - numero2;
		int divisão = numero1  / numero2;
		int multiplicação = numero1 * numero2;
		
		System.out.println("A soma dos 2 numeros digitados é igual á " + soma);
		System.out.println("A subtração dos 2 numeros digitados é igual á " + subtração);
		System.out.println("A divisão dos 2 numeros digitados é igual á " + divisão);
		System.out.println("A multiplicação dos 2 numeros digitados é igual á " + multiplicação);
		
	}
}
