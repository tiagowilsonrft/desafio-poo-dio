package br.com.dio.desafio.dominio;

public class Instrutor extends Conteudo {
	private String nome;
	private String materia;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
