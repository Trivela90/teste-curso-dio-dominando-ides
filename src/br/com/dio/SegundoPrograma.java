package br.com.dio;

/* so clicar crtl+shift+o para importar */
import br.com.dio.model.Gato;

public class SegundoPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		/* sysout livros vai mostrar endereco de memoria 
		 * porque nao foi criada outra string */
		System.out.println(livros);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World!" + (a+b)); */

	}

}

class Livros {
	private String nome;
	private String npag;
}