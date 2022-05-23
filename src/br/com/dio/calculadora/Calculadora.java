package br.com.dio.calculadora;

import java.util.Scanner;

/* Crtl+Shift+T para encontrar classe */


public class Calculadora {	
	
	public static void main(String[] args) {
		/* Crtl+Shift+O no Scanner para criar import */
		Scanner scan = new Scanner(System.in);

		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		/* seleciona soma de soma(a,b) e clica
		 * Crtl+2 e, em seguida, clica L.
		 * Assim ele criará uma variável que recebe
		 * o valor dessa funcao */
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		/* Como divisao eh definida em int, o valor
		 * so retornara parte inteira */
		int divisao = divisao(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subtracao " + subtracao);
		System.out.println("multiplicacao " + multiplicacao);
		System.out.println("divisao " + divisao); 
		
		
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	/* Crtl+Alt+Seta para baixo crtl+c crtl+v do comando
	 * selecionado pelo cursor */
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	
}
