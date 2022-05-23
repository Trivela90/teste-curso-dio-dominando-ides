package br.com.dio.model;

import java.util.Objects;

public class Gato {
	
	/* Crtl+Shift+f ajusta todas as linhas que estao
	 * com espacamento desalinhado	 */
	
	private String nome;
	private String cor;
	private Integer idade;
	
	/* Construtor vazio*/
	/* Crtl + d apaga linha */
	public Gato() {}

	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/* Criando Getters and Setters */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	/* crtl + 3 persquisar "equals" Generate hashCode() */

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	/* crtl + 3 pesquisar "toString" Generate toString() " */
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
	
	
	/* Fazendo comentario */
	
	/*public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}*/

	
}
