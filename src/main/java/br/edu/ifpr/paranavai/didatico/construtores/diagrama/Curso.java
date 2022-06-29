package br.edu.ifpr.paranavai.construtores.diagrama;


public class Curso {
	// atributos
	private String nome;
	private String dataDeCriacao;
	private String periodo;
	
	public Curso() {
		
	}
	public Curso(String nome, String dataDeCriacao, String periodo) {
		this.nome = nome;
		this.dataDeCriacao = dataDeCriacao;
		this.periodo = periodo;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeCriacao() {
		return this.dataDeCriacao;
	}
	public void setDataDeCriacao(String dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
}
