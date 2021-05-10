package exerciciosFucturaCasa;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora2{

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		int voltar3 = 1;
		int voltar = 0;
		do {
			
		
		System.out.println("*** Olá Seja Bem vindo, SELECIONE A OPÇÃO DESEJADA PARA REALIZAR SUA OPERAÇÃO. ***\n"
				+ "Digite -> 1 para Soma\n"
				+ "Digite -> 2 para Subtração\n"
				+ "Digite -> 3 para Divisão\n"
				+ "Digite -> 4 para Multiplicação\n"
				+ "Digite -> 5 para Raiz Quadrada\n"
				+ "Digite -> 6 para Potencia\n"
				+ "Digite -> 7 para Saber se o numero é par ou ímpar\n"
				+ "Digite -> 8 para Saber se o numero é divisivel por 3\n"
				+ "Digite A OPÇÃO DESEJADA: ");
		
	    int calculadora = sc.nextInt();
		switch (calculadora) {
		
		case 1: System.out.println("Digite um numero");
			int numero1 = sc.nextInt();
			System.out.println("Digite outro numero");
			int numero2 = sc.nextInt();
			System.out.println("O RESULTADO DESTA OPERAÇÃO É: " + numero1 + numero2);
			System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
		    voltar = sc.nextInt();
		    break;
		
		case 2: System.out.println("Digite um numero");
		int subtração1 = sc.nextInt();
		System.out.println("Digite outro numero");
		int subtração2 = sc.nextInt();
		System.out.println("O RESULTADO DESTA OPERAÇÃO É: " + (subtração1 - subtração2)); 
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
	    break;
		
		case 3:  System.out.println("Digite um numero");
		int divisão1 = sc.nextInt();
		System.out.println("Digite outro numero");
		int divisão2 = sc.nextInt();
		System.out.println("O RESULTADO DESTA OPERAÇÃO É: " + divisão1 / divisão2); 
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
		break;
 
        case 4:  System.out.println("Digite um numero");
		int multiplicação1 = sc.nextInt();
		System.out.println("Digite outro numero");
		int multiplicação2 = sc.nextInt();
		System.out.println("O RESULTADO DESTA OPERAÇÃO É: " + multiplicação1 * multiplicação2);
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
		break;
      
        case 5:  System.out.println("Digite um numero");
        int numero = sc.nextInt();
        int raiz = (int) Math.sqrt(numero);
		if (numero == raiz * raiz) {System.out.println("O RESULTADO DESTA RAIZ QUADRADA É: " + raiz);	
		}
		else {System.out.println("Este numero não possui uma raiz quadrada exata");}
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
        
		break;
 
        case 6:  System.out.println("Digite um numero");
        int potencia1 = sc.nextInt();
        System.out.println("Digite um numero");
        int potencia2 = sc.nextInt();
        int potencia = (int) Math.pow(potencia1,potencia2);
		System.out.println("O RESULTADO DESTA OPERAÇÃO É: " + potencia);
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
		break;
        
        case 7: System.out.println("Digite um numero: ");
        int parouimpar = sc.nextInt();
        if (parouimpar %2 == 0) { System.out.println("ESTE NUMERO É UM NUMERO PAR");	
		}
        else {
        	System.out.println("ESTE NUMERO É UM NUMERO IMPAR");
        }
        System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
		break;
		
        case 8:  System.out.println("Digite um numero");
        int divisibilidade1 = sc.nextInt();
        
        if (divisibilidade1 %3 == 0) { System.out.println("ESTE NUMERO É DIVISIVEL POR 3");
			
		}
        else {System.out.println("ESTE NUMERO NÃO É DIVISIVEL POR 3");
			
        }
		System.out.println("DIGITE 1 PARA VOLTAR PARA O MEU INCIAL: ");
	    voltar = sc.nextInt();
	    break;
	    default: System.out.println("Você digitou A OPÇÃO ERRADA, TENTE NOVAMENTE.");
	    
			
	}}
		
		
		while (voltar == voltar3 );{
			System.out.println("ESTA OPÇÃO É INVALIDA, POR FAVOR REINICIE O PROGRAMA");
		}	
		}
		
		
}
		
